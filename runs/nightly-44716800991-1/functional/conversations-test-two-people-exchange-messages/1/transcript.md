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
| 1 | `POST /v1/accounts` | 201 | 295 | `qa-c8427928-2c2d-46cf-8a6d-b7be3cecfb94` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-ba64ab0c-eb59-4b8a-a0f7-2c4f40481cae` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-4a49dc23-6041-42f4-b2be-2175139bc0f5` |
| 4 | `POST /v1/conversations` | 201 | 87 | `qa-23438424-0e44-4269-b1fa-e77d698fd52c` |
| 5 | `POST /v1/auth/token` | 200 | 21 | `qa-66e2fe8e-7447-47e8-868a-76f20608e13a` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 21 | `qa-2aea8697-0e57-4705-bd25-9f274722f460` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 23 | `qa-00aa544e-c3c3-42d4-9859-74c116913555` |
| 8 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-c58db35c-6d29-45e0-afb3-0ec1bab583fc` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-92f0cd1d-cce0-4e72-a92a-594830e859b6` |
| 10 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-bd020d5d-70e6-4c56-8ad8-2838a587a5e8` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-d0598d98-1c19-46ca-a553-c8f74b9687d8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c8427928-2c2d-46cf-8a6d-b7be3cecfb94

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8427928-2c2d-46cf-8a6d-b7be3cecfb94
Content-Type: application/json

--- request body ---
{"handle":"qa-d9a62cec71e8","displayName":"QA d9a62cec71e8","password":"****","region":"eu"}

--- response: 201 in 295 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8427928-2c2d-46cf-8a6d-b7be3cecfb94
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
Location: /v1/accounts/qa-d9a62cec71e8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b3720ada-08ae-4786-be4e-379cd9bebcb5","handle":"qa-d9a62cec71e8","displayName":"QA d9a62cec71e8","region":"eu","role":"user","createdAt":"2026-11-20T10:10:05.395945783Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ba64ab0c-eb59-4b8a-a0f7-2c4f40481cae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba64ab0c-eb59-4b8a-a0f7-2c4f40481cae
Content-Type: application/json

--- request body ---
{"handle":"qa-61361b532a2e","displayName":"QA 61361b532a2e","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba64ab0c-eb59-4b8a-a0f7-2c4f40481cae
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
Location: /v1/accounts/qa-61361b532a2e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d03139cd-f436-45d3-a1df-12ec29772dc0","handle":"qa-61361b532a2e","displayName":"QA 61361b532a2e","region":"eu","role":"user","createdAt":"2026-11-20T10:10:05.674671482Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4a49dc23-6041-42f4-b2be-2175139bc0f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a49dc23-6041-42f4-b2be-2175139bc0f5
Content-Type: application/json

--- request body ---
{"handle":"qa-d9a62cec71e8","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a49dc23-6041-42f4-b2be-2175139bc0f5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b3720ada-08ae-4786-be4e-379cd9bebcb5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-23438424-0e44-4269-b1fa-e77d698fd52c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23438424-0e44-4269-b1fa-e77d698fd52c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-61361b532a2e","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 87 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-23438424-0e44-4269-b1fa-e77d698fd52c
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
Location: /v1/conversations/cnv_372b05cb-de5b-4684-b8c6-6f8ebbdbe7cc
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_372b05cb-de5b-4684-b8c6-6f8ebbdbe7cc","subject":"Lunch?","status":"open","region":"eu","participants":["qa-d9a62cec71e8","qa-61361b532a2e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:10:05.850227408Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-66e2fe8e-7447-47e8-868a-76f20608e13a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66e2fe8e-7447-47e8-868a-76f20608e13a
Content-Type: application/json

--- request body ---
{"handle":"qa-61361b532a2e","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-66e2fe8e-7447-47e8-868a-76f20608e13a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d03139cd-f436-45d3-a1df-12ec29772dc0"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_372b05cb-de5b-4684-b8c6-6f8ebbdbe7cc/messages
correlation: qa-2aea8697-0e57-4705-bd25-9f274722f460

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2aea8697-0e57-4705-bd25-9f274722f460
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-2aea8697-0e57-4705-bd25-9f274722f460
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

{"id":"msg_f9357b93-694e-435f-af17-9a9250a5bca3","conversationId":"cnv_372b05cb-de5b-4684-b8c6-6f8ebbdbe7cc","sender":"qa-61361b532a2e","body":"Friday works","createdAt":"2026-11-20T10:10:05.971658039Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_372b05cb-de5b-4684-b8c6-6f8ebbdbe7cc/messages
correlation: qa-00aa544e-c3c3-42d4-9859-74c116913555

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00aa544e-c3c3-42d4-9859-74c116913555
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Fri, 20 Nov 2026 10:10:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-00aa544e-c3c3-42d4-9859-74c116913555
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

{"items":[{"id":"msg_790ddd97-79fe-458e-9233-0d75149fbbb7","conversationId":"cnv_372b05cb-de5b-4684-b8c6-6f8ebbdbe7cc","sender":"qa-d9a62cec71e8","body":"Free on Friday?","createdAt":"2026-11-20T10:10:05.850445586Z"},{"id":"msg_f9357b93-694e-435f-af17-9a9250a5bca3","conversationId":"cnv_372b05cb-de5b-4684-b8c6-6f8ebbdbe7cc","sender":"qa-61361b532a2e","body":"Friday works","createdAt":"2026-11-20T10:10:05.971658039Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c58db35c-6d29-45e0-afb3-0ec1bab583fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c58db35c-6d29-45e0-afb3-0ec1bab583fc
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c58db35c-6d29-45e0-afb3-0ec1bab583fc
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
correlation: qa-92f0cd1d-cce0-4e72-a92a-594830e859b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92f0cd1d-cce0-4e72-a92a-594830e859b6
Content-Type: application/json

--- request body ---
{"handle":"qa-61361b532a2e","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92f0cd1d-cce0-4e72-a92a-594830e859b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-92f0cd1d-cce0-4e72-a92a-594830e859b6"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bd020d5d-70e6-4c56-8ad8-2838a587a5e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd020d5d-70e6-4c56-8ad8-2838a587a5e8
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bd020d5d-70e6-4c56-8ad8-2838a587a5e8
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
correlation: qa-d0598d98-1c19-46ca-a553-c8f74b9687d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0598d98-1c19-46ca-a553-c8f74b9687d8
Content-Type: application/json

--- request body ---
{"handle":"qa-d9a62cec71e8","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0598d98-1c19-46ca-a553-c8f74b9687d8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d0598d98-1c19-46ca-a553-c8f74b9687d8"}
```
