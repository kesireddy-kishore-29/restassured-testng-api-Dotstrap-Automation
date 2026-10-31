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
| 1 | `POST /v1/accounts` | 201 | 368 | `qa-97d559ee-c900-429e-af28-a2f66bac78e7` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-7958b366-73e6-4d2f-8040-459db5324869` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-2eef8de7-7ade-49d4-b15c-eb94bfac2330` |
| 4 | `POST /v1/conversations` | 201 | 36 | `qa-01c7636a-889c-45a3-9584-364dd756337f` |
| 5 | `POST /v1/auth/token` | 200 | 21 | `qa-f247fdd7-6a2c-4dae-b461-c51a5442e24e` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 25 | `qa-f72c97ce-a42f-40a8-884a-728a4327aed3` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 14 | `qa-d3b21f56-8e7f-4f88-875b-ee4b01319575` |
| 8 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-18083942-ce81-4ac8-8cc7-7cafb61d1b49` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-2e6454ed-6765-4838-8391-9743b9ee60d1` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-2092be1e-a247-4fdb-b7e2-77a0a7297ed2` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-becc70aa-f4be-4243-b379-05ffd092aeac` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-97d559ee-c900-429e-af28-a2f66bac78e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97d559ee-c900-429e-af28-a2f66bac78e7
Content-Type: application/json

--- request body ---
{"handle":"qa-ea18463cb363","displayName":"QA ea18463cb363","password":"****","region":"eu"}

--- response: 201 in 368 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-97d559ee-c900-429e-af28-a2f66bac78e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-ea18463cb363
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fca77889-5733-41e0-b848-b263b6375e40","handle":"qa-ea18463cb363","displayName":"QA ea18463cb363","region":"eu","role":"user","createdAt":"2026-10-24T07:25:04.580927286Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7958b366-73e6-4d2f-8040-459db5324869

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7958b366-73e6-4d2f-8040-459db5324869
Content-Type: application/json

--- request body ---
{"handle":"qa-e0fad71142f8","displayName":"QA e0fad71142f8","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-7958b366-73e6-4d2f-8040-459db5324869
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
Location: /v1/accounts/qa-e0fad71142f8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_31721888-0fe1-4b98-b5f2-9e6f624f0b80","handle":"qa-e0fad71142f8","displayName":"QA e0fad71142f8","region":"eu","role":"user","createdAt":"2026-10-24T07:25:04.873064890Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2eef8de7-7ade-49d4-b15c-eb94bfac2330

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2eef8de7-7ade-49d4-b15c-eb94bfac2330
Content-Type: application/json

--- request body ---
{"handle":"qa-ea18463cb363","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2eef8de7-7ade-49d4-b15c-eb94bfac2330
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fca77889-5733-41e0-b848-b263b6375e40"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-01c7636a-889c-45a3-9584-364dd756337f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-01c7636a-889c-45a3-9584-364dd756337f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e0fad71142f8","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 36 ms ---
Date: Sat, 24 Oct 2026 07:25:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-01c7636a-889c-45a3-9584-364dd756337f
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
Location: /v1/conversations/cnv_a4319a08-e788-403a-bcd8-65dbb28570f0
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_a4319a08-e788-403a-bcd8-65dbb28570f0","subject":"Lunch?","status":"open","region":"eu","participants":["qa-ea18463cb363","qa-e0fad71142f8"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:05.002759501Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-f247fdd7-6a2c-4dae-b461-c51a5442e24e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f247fdd7-6a2c-4dae-b461-c51a5442e24e
Content-Type: application/json

--- request body ---
{"handle":"qa-e0fad71142f8","password":"****"}

--- response: 200 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f247fdd7-6a2c-4dae-b461-c51a5442e24e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_31721888-0fe1-4b98-b5f2-9e6f624f0b80"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_a4319a08-e788-403a-bcd8-65dbb28570f0/messages
correlation: qa-f72c97ce-a42f-40a8-884a-728a4327aed3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f72c97ce-a42f-40a8-884a-728a4327aed3
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 25 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-f72c97ce-a42f-40a8-884a-728a4327aed3
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

{"id":"msg_fcbd148e-309c-46fa-a4c1-4d914aab60bb","conversationId":"cnv_a4319a08-e788-403a-bcd8-65dbb28570f0","sender":"qa-e0fad71142f8","body":"Friday works","createdAt":"2026-10-24T07:25:05.109004712Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_a4319a08-e788-403a-bcd8-65dbb28570f0/messages
correlation: qa-d3b21f56-8e7f-4f88-875b-ee4b01319575

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3b21f56-8e7f-4f88-875b-ee4b01319575
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3b21f56-8e7f-4f88-875b-ee4b01319575
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

{"items":[{"id":"msg_cb2fa54d-11ad-4581-97c6-483dea58956f","conversationId":"cnv_a4319a08-e788-403a-bcd8-65dbb28570f0","sender":"qa-ea18463cb363","body":"Free on Friday?","createdAt":"2026-10-24T07:25:05.002982816Z"},{"id":"msg_fcbd148e-309c-46fa-a4c1-4d914aab60bb","conversationId":"cnv_a4319a08-e788-403a-bcd8-65dbb28570f0","sender":"qa-e0fad71142f8","body":"Friday works","createdAt":"2026-10-24T07:25:05.109004712Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-18083942-ce81-4ac8-8cc7-7cafb61d1b49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18083942-ce81-4ac8-8cc7-7cafb61d1b49
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-18083942-ce81-4ac8-8cc7-7cafb61d1b49
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
correlation: qa-2e6454ed-6765-4838-8391-9743b9ee60d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e6454ed-6765-4838-8391-9743b9ee60d1
Content-Type: application/json

--- request body ---
{"handle":"qa-e0fad71142f8","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e6454ed-6765-4838-8391-9743b9ee60d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2e6454ed-6765-4838-8391-9743b9ee60d1"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2092be1e-a247-4fdb-b7e2-77a0a7297ed2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2092be1e-a247-4fdb-b7e2-77a0a7297ed2
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2092be1e-a247-4fdb-b7e2-77a0a7297ed2
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
correlation: qa-becc70aa-f4be-4243-b379-05ffd092aeac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-becc70aa-f4be-4243-b379-05ffd092aeac
Content-Type: application/json

--- request body ---
{"handle":"qa-ea18463cb363","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-becc70aa-f4be-4243-b379-05ffd092aeac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-becc70aa-f4be-4243-b379-05ffd092aeac"}
```
