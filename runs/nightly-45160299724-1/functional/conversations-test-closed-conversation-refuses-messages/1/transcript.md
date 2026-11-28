# Transcript: A closed conversation refuses new messages with 409

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#closedConversationRefusesMessages` |
| Features | FEAT-CONV-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 422 | `qa-9e3fc771-aa8f-4c9a-925d-5b030ad0a00b` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-a301f82f-32a5-4501-b94e-8a673f405176` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-432645ad-6336-4813-ba43-a37c3db74309` |
| 4 | `POST /v1/conversations` | 201 | 54 | `qa-d9770f62-d633-4921-b174-166c18d8ed1a` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 35 | `qa-be4f0e83-c5f5-434b-9a5b-dc8f834e72af` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-9dc8b6d7-4117-464c-8cd9-7cacc1fe9d2a` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 36 | `qa-2663ce7b-3a04-4cfe-b3d2-4b42f74d03f4` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-e7743c02-6904-42e3-bd04-6a2f2434497c` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-a5028b4d-c38a-4608-92a3-cb3fc6180311` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-5524e8ab-b39e-42a7-af4d-03355b17d37a` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-c0d648a9-54ab-4948-9ce7-c78d5eed0369` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9e3fc771-aa8f-4c9a-925d-5b030ad0a00b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e3fc771-aa8f-4c9a-925d-5b030ad0a00b
Content-Type: application/json

--- request body ---
{"handle":"qa-0f2ac6ad59b9","displayName":"QA 0f2ac6ad59b9","password":"****","region":"eu"}

--- response: 201 in 422 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e3fc771-aa8f-4c9a-925d-5b030ad0a00b
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
Location: /v1/accounts/qa-0f2ac6ad59b9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_437194d7-387a-4464-b22d-1918fdafda01","handle":"qa-0f2ac6ad59b9","displayName":"QA 0f2ac6ad59b9","region":"eu","role":"user","createdAt":"2026-11-23T10:55:02.261778149Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a301f82f-32a5-4501-b94e-8a673f405176

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a301f82f-32a5-4501-b94e-8a673f405176
Content-Type: application/json

--- request body ---
{"handle":"qa-34f130aca80d","displayName":"QA 34f130aca80d","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a301f82f-32a5-4501-b94e-8a673f405176
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-34f130aca80d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f452b25f-2b74-4135-8cf0-b771f24d576b","handle":"qa-34f130aca80d","displayName":"QA 34f130aca80d","region":"eu","role":"user","createdAt":"2026-11-23T10:55:02.784800976Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-432645ad-6336-4813-ba43-a37c3db74309

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-432645ad-6336-4813-ba43-a37c3db74309
Content-Type: application/json

--- request body ---
{"handle":"qa-0f2ac6ad59b9","password":"****"}

--- response: 200 in 30 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-432645ad-6336-4813-ba43-a37c3db74309
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_437194d7-387a-4464-b22d-1918fdafda01"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d9770f62-d633-4921-b174-166c18d8ed1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9770f62-d633-4921-b174-166c18d8ed1a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-34f130aca80d","subject":"Quick question","message":"Hi"}

--- response: 201 in 54 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9770f62-d633-4921-b174-166c18d8ed1a
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
Location: /v1/conversations/cnv_135bd502-e274-44de-87ec-f624d3978c32
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_135bd502-e274-44de-87ec-f624d3978c32","subject":"Quick question","status":"open","region":"eu","participants":["qa-0f2ac6ad59b9","qa-34f130aca80d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:55:02.922776221Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_135bd502-e274-44de-87ec-f624d3978c32/close
correlation: qa-be4f0e83-c5f5-434b-9a5b-dc8f834e72af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be4f0e83-c5f5-434b-9a5b-dc8f834e72af
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-be4f0e83-c5f5-434b-9a5b-dc8f834e72af
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
Content-Length: 283

{"id":"cnv_135bd502-e274-44de-87ec-f624d3978c32","subject":"Quick question","status":"closed","region":"eu","participants":["qa-0f2ac6ad59b9","qa-34f130aca80d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-23T10:55:02.922776221Z","closedAt":"2026-11-23T10:55:03.010592266Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9dc8b6d7-4117-464c-8cd9-7cacc1fe9d2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dc8b6d7-4117-464c-8cd9-7cacc1fe9d2a
Content-Type: application/json

--- request body ---
{"handle":"qa-34f130aca80d","password":"****"}

--- response: 200 in 33 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-9dc8b6d7-4117-464c-8cd9-7cacc1fe9d2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f452b25f-2b74-4135-8cf0-b771f24d576b"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_135bd502-e274-44de-87ec-f624d3978c32/messages
correlation: qa-2663ce7b-3a04-4cfe-b3d2-4b42f74d03f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2663ce7b-3a04-4cfe-b3d2-4b42f74d03f4
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 36 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2663ce7b-3a04-4cfe-b3d2-4b42f74d03f4
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
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_135bd502-e274-44de-87ec-f624d3978c32/messages","correlationId":"qa-2663ce7b-3a04-4cfe-b3d2-4b42f74d03f4"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e7743c02-6904-42e3-bd04-6a2f2434497c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7743c02-6904-42e3-bd04-6a2f2434497c
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e7743c02-6904-42e3-bd04-6a2f2434497c
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
correlation: qa-a5028b4d-c38a-4608-92a3-cb3fc6180311

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5028b4d-c38a-4608-92a3-cb3fc6180311
Content-Type: application/json

--- request body ---
{"handle":"qa-34f130aca80d","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5028b4d-c38a-4608-92a3-cb3fc6180311
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a5028b4d-c38a-4608-92a3-cb3fc6180311"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5524e8ab-b39e-42a7-af4d-03355b17d37a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5524e8ab-b39e-42a7-af4d-03355b17d37a
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5524e8ab-b39e-42a7-af4d-03355b17d37a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 9
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-c0d648a9-54ab-4948-9ce7-c78d5eed0369

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0d648a9-54ab-4948-9ce7-c78d5eed0369
Content-Type: application/json

--- request body ---
{"handle":"qa-0f2ac6ad59b9","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c0d648a9-54ab-4948-9ce7-c78d5eed0369
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c0d648a9-54ab-4948-9ce7-c78d5eed0369"}
```
