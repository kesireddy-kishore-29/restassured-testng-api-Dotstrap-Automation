# Transcript: Two people start a conversation and exchange messages

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#twoPeopleExchangeMessages` |
| Features | FEAT-CONV-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 430 | `qa-3f982799-25fa-4d93-b492-1935f628009e` |
| 2 | `POST /v1/accounts` | 201 | 55 | `qa-2983035d-9b1b-449a-bee9-11a6d100cd31` |
| 3 | `POST /v1/auth/token` | 200 | 73 | `qa-032abc25-956d-4f26-abfa-bbc5a994e7a9` |
| 4 | `POST /v1/conversations` | 201 | 47 | `qa-b7d874f9-a531-4cdb-8747-498485273ca8` |
| 5 | `POST /v1/auth/token` | 200 | 26 | `qa-1443c9cb-74ad-4483-b04a-d994a44a1d68` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 54 | `qa-ff50d3c4-63ce-48ae-979a-0fa7f920d396` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 20 | `qa-cc59ceff-8598-465e-9010-7b6c4fe28b52` |
| 8 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-2ac1a5e4-972e-49cd-b702-8fe2b6630991` |
| 9 | `POST /v1/auth/token` | 401 | 15 | `qa-073a452b-f495-46a4-98aa-17bd002d8738` |
| 10 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-faaa829c-0aa5-4421-85e1-7208a2066456` |
| 11 | `POST /v1/auth/token` | 401 | 16 | `qa-197a8f15-5c14-4214-8ba8-cf4174c5e4bf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3f982799-25fa-4d93-b492-1935f628009e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f982799-25fa-4d93-b492-1935f628009e
Content-Type: application/json

--- request body ---
{"handle":"qa-9982c9663430","displayName":"QA 9982c9663430","password":"****","region":"eu"}

--- response: 201 in 430 ms ---
Date: Wed, 18 Nov 2026 10:19:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f982799-25fa-4d93-b492-1935f628009e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-9982c9663430
X-Served-Region: eu
Content-Length: 181

{"id":"acc_214683f8-8e6e-4846-8688-763535edf7d2","handle":"qa-9982c9663430","displayName":"QA 9982c9663430","region":"eu","role":"user","createdAt":"2026-11-18T10:19:48.052925552Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2983035d-9b1b-449a-bee9-11a6d100cd31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2983035d-9b1b-449a-bee9-11a6d100cd31
Content-Type: application/json

--- request body ---
{"handle":"qa-d96d780bfe10","displayName":"QA d96d780bfe10","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-2983035d-9b1b-449a-bee9-11a6d100cd31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-d96d780bfe10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e719e2f7-e4e6-4922-bfd2-d52a8d10d70a","handle":"qa-d96d780bfe10","displayName":"QA d96d780bfe10","region":"eu","role":"user","createdAt":"2026-11-18T10:19:48.536524408Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-032abc25-956d-4f26-abfa-bbc5a994e7a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-032abc25-956d-4f26-abfa-bbc5a994e7a9
Content-Type: application/json

--- request body ---
{"handle":"qa-9982c9663430","password":"****"}

--- response: 200 in 73 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-032abc25-956d-4f26-abfa-bbc5a994e7a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_214683f8-8e6e-4846-8688-763535edf7d2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-b7d874f9-a531-4cdb-8747-498485273ca8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7d874f9-a531-4cdb-8747-498485273ca8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d96d780bfe10","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 47 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7d874f9-a531-4cdb-8747-498485273ca8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_10864fc8-9590-41de-a44a-9e46c56d95f5
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_10864fc8-9590-41de-a44a-9e46c56d95f5","subject":"Lunch?","status":"open","region":"eu","participants":["qa-9982c9663430","qa-d96d780bfe10"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:48.719670477Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-1443c9cb-74ad-4483-b04a-d994a44a1d68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1443c9cb-74ad-4483-b04a-d994a44a1d68
Content-Type: application/json

--- request body ---
{"handle":"qa-d96d780bfe10","password":"****"}

--- response: 200 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-1443c9cb-74ad-4483-b04a-d994a44a1d68
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e719e2f7-e4e6-4922-bfd2-d52a8d10d70a"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_10864fc8-9590-41de-a44a-9e46c56d95f5/messages
correlation: qa-ff50d3c4-63ce-48ae-979a-0fa7f920d396

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff50d3c4-63ce-48ae-979a-0fa7f920d396
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 54 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff50d3c4-63ce-48ae-979a-0fa7f920d396
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 203

{"id":"msg_2d9fa33b-c546-49d3-b318-b5171e6b22f7","conversationId":"cnv_10864fc8-9590-41de-a44a-9e46c56d95f5","sender":"qa-d96d780bfe10","body":"Friday works","createdAt":"2026-11-18T10:19:48.896655579Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_10864fc8-9590-41de-a44a-9e46c56d95f5/messages
correlation: qa-cc59ceff-8598-465e-9010-7b6c4fe28b52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc59ceff-8598-465e-9010-7b6c4fe28b52
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc59ceff-8598-465e-9010-7b6c4fe28b52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 432

{"items":[{"id":"msg_516011c2-8d3e-4ce6-a43b-28c92a6b8c44","conversationId":"cnv_10864fc8-9590-41de-a44a-9e46c56d95f5","sender":"qa-9982c9663430","body":"Free on Friday?","createdAt":"2026-11-18T10:19:48.719973319Z"},{"id":"msg_2d9fa33b-c546-49d3-b318-b5171e6b22f7","conversationId":"cnv_10864fc8-9590-41de-a44a-9e46c56d95f5","sender":"qa-d96d780bfe10","body":"Friday works","createdAt":"2026-11-18T10:19:48.896655579Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2ac1a5e4-972e-49cd-b702-8fe2b6630991

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ac1a5e4-972e-49cd-b702-8fe2b6630991
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2ac1a5e4-972e-49cd-b702-8fe2b6630991
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-073a452b-f495-46a4-98aa-17bd002d8738

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-073a452b-f495-46a4-98aa-17bd002d8738
Content-Type: application/json

--- request body ---
{"handle":"qa-d96d780bfe10","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-073a452b-f495-46a4-98aa-17bd002d8738
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-073a452b-f495-46a4-98aa-17bd002d8738"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-faaa829c-0aa5-4421-85e1-7208a2066456

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-faaa829c-0aa5-4421-85e1-7208a2066456
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-faaa829c-0aa5-4421-85e1-7208a2066456
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-197a8f15-5c14-4214-8ba8-cf4174c5e4bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-197a8f15-5c14-4214-8ba8-cf4174c5e4bf
Content-Type: application/json

--- request body ---
{"handle":"qa-9982c9663430","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 18 Nov 2026 10:19:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-197a8f15-5c14-4214-8ba8-cf4174c5e4bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-197a8f15-5c14-4214-8ba8-cf4174c5e4bf"}
```
