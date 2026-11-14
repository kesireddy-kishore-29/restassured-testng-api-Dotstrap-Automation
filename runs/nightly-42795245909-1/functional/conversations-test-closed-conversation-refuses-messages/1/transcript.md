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
| 1 | `POST /v1/accounts` | 201 | 396 | `qa-d139eb26-8c06-4a1a-a901-92be8769e5f2` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-bcf1d2bd-5fc6-48cc-8905-c8952e92624d` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-8bf880ba-d006-4662-9da6-8806a44f1b5b` |
| 4 | `POST /v1/conversations` | 201 | 36 | `qa-9cbb2e6d-aadd-49d6-9e6f-75ef86075089` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 34 | `qa-e7812ba2-a572-4515-ac25-de3fe24fcf3b` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-46044e5b-c00f-4d53-9b21-71cc9b9db932` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 37 | `qa-deb4b1bd-8d35-4cc6-a47b-b02dfa97bb8b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-378050cf-9959-4600-a107-aaba2b7aef05` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-2f917495-7774-49fc-a72a-4aebc50fd627` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-04109042-3f00-4642-b97d-14f281c013a2` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-318b6071-f474-413f-a494-884110f3be0c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d139eb26-8c06-4a1a-a901-92be8769e5f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d139eb26-8c06-4a1a-a901-92be8769e5f2
Content-Type: application/json

--- request body ---
{"handle":"qa-177fb0c4eebb","displayName":"QA 177fb0c4eebb","password":"****","region":"eu"}

--- response: 201 in 396 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-d139eb26-8c06-4a1a-a901-92be8769e5f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-177fb0c4eebb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c7e633b8-ae7d-4a1f-9105-5f1520b80b8b","handle":"qa-177fb0c4eebb","displayName":"QA 177fb0c4eebb","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.313441001Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bcf1d2bd-5fc6-48cc-8905-c8952e92624d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bcf1d2bd-5fc6-48cc-8905-c8952e92624d
Content-Type: application/json

--- request body ---
{"handle":"qa-2cd4b012c614","displayName":"QA 2cd4b012c614","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-bcf1d2bd-5fc6-48cc-8905-c8952e92624d
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
Location: /v1/accounts/qa-2cd4b012c614
X-Served-Region: eu
Content-Length: 181

{"id":"acc_446ee989-ddfd-47ff-a6ed-501941edbed9","handle":"qa-2cd4b012c614","displayName":"QA 2cd4b012c614","region":"eu","role":"user","createdAt":"2026-11-10T09:59:37.607793048Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8bf880ba-d006-4662-9da6-8806a44f1b5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bf880ba-d006-4662-9da6-8806a44f1b5b
Content-Type: application/json

--- request body ---
{"handle":"qa-177fb0c4eebb","password":"****"}

--- response: 200 in 31 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bf880ba-d006-4662-9da6-8806a44f1b5b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c7e633b8-ae7d-4a1f-9105-5f1520b80b8b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9cbb2e6d-aadd-49d6-9e6f-75ef86075089

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cbb2e6d-aadd-49d6-9e6f-75ef86075089
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2cd4b012c614","subject":"Quick question","message":"Hi"}

--- response: 201 in 36 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cbb2e6d-aadd-49d6-9e6f-75ef86075089
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
Location: /v1/conversations/cnv_c83e0b38-4c45-4dab-b5b6-edec682ffffb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c83e0b38-4c45-4dab-b5b6-edec682ffffb","subject":"Quick question","status":"open","region":"eu","participants":["qa-177fb0c4eebb","qa-2cd4b012c614"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.754182160Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_c83e0b38-4c45-4dab-b5b6-edec682ffffb/close
correlation: qa-e7812ba2-a572-4515-ac25-de3fe24fcf3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7812ba2-a572-4515-ac25-de3fe24fcf3b
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e7812ba2-a572-4515-ac25-de3fe24fcf3b
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

{"id":"cnv_c83e0b38-4c45-4dab-b5b6-edec682ffffb","subject":"Quick question","status":"closed","region":"eu","participants":["qa-177fb0c4eebb","qa-2cd4b012c614"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:37.754182160Z","closedAt":"2026-11-10T09:59:37.857491991Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-46044e5b-c00f-4d53-9b21-71cc9b9db932

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46044e5b-c00f-4d53-9b21-71cc9b9db932
Content-Type: application/json

--- request body ---
{"handle":"qa-2cd4b012c614","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-46044e5b-c00f-4d53-9b21-71cc9b9db932
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_446ee989-ddfd-47ff-a6ed-501941edbed9"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_c83e0b38-4c45-4dab-b5b6-edec682ffffb/messages
correlation: qa-deb4b1bd-8d35-4cc6-a47b-b02dfa97bb8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-deb4b1bd-8d35-4cc6-a47b-b02dfa97bb8b
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 37 ms ---
Date: Tue, 10 Nov 2026 09:59:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-deb4b1bd-8d35-4cc6-a47b-b02dfa97bb8b
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_c83e0b38-4c45-4dab-b5b6-edec682ffffb/messages","correlationId":"qa-deb4b1bd-8d35-4cc6-a47b-b02dfa97bb8b"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-378050cf-9959-4600-a107-aaba2b7aef05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-378050cf-9959-4600-a107-aaba2b7aef05
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-378050cf-9959-4600-a107-aaba2b7aef05
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
correlation: qa-2f917495-7774-49fc-a72a-4aebc50fd627

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f917495-7774-49fc-a72a-4aebc50fd627
Content-Type: application/json

--- request body ---
{"handle":"qa-2cd4b012c614","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f917495-7774-49fc-a72a-4aebc50fd627
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2f917495-7774-49fc-a72a-4aebc50fd627"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-04109042-3f00-4642-b97d-14f281c013a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04109042-3f00-4642-b97d-14f281c013a2
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-04109042-3f00-4642-b97d-14f281c013a2
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
correlation: qa-318b6071-f474-413f-a494-884110f3be0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-318b6071-f474-413f-a494-884110f3be0c
Content-Type: application/json

--- request body ---
{"handle":"qa-177fb0c4eebb","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 10 Nov 2026 09:59:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-318b6071-f474-413f-a494-884110f3be0c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-318b6071-f474-413f-a494-884110f3be0c"}
```
