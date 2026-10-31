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
| 1 | `POST /v1/accounts` | 201 | 438 | `qa-d281e7b1-7ee6-4889-89dc-9367831c8584` |
| 2 | `POST /v1/accounts` | 201 | 126 | `qa-33231ec5-7b10-4f7a-89d8-f30716c077f6` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-09a3af2e-e28e-4e17-bc0f-68c5ab68cb3b` |
| 4 | `POST /v1/conversations` | 201 | 64 | `qa-161fafed-0bdf-4465-899e-194d49da5d5e` |
| 5 | `POST /v1/auth/token` | 200 | 42 | `qa-3b254b08-8203-4d8e-9da0-df1b3e82ce03` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 29 | `qa-9ff214ae-5132-4db5-9d15-3808bbcfba2d` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 37 | `qa-a86ae66d-7c6e-4119-ae7f-40d3e0756a14` |
| 8 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-678044e8-4014-4996-9add-1f5ef93f8897` |
| 9 | `POST /v1/auth/token` | 401 | 12 | `qa-46bccfd2-0a73-4f29-82b3-151b0a838c0f` |
| 10 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-6ef5c9ef-21d5-47b3-9e41-06c28026ff5e` |
| 11 | `POST /v1/auth/token` | 401 | 12 | `qa-6453cddb-789d-4432-b5f4-a8c86b559dca` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d281e7b1-7ee6-4889-89dc-9367831c8584

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d281e7b1-7ee6-4889-89dc-9367831c8584
Content-Type: application/json

--- request body ---
{"handle":"qa-b72e4be13cc8","displayName":"QA b72e4be13cc8","password":"****","region":"eu"}

--- response: 201 in 438 ms ---
Date: Fri, 23 Oct 2026 07:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d281e7b1-7ee6-4889-89dc-9367831c8584
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
Location: /v1/accounts/qa-b72e4be13cc8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_836f23b5-4b5d-42d8-9b41-7f25e25b05fe","handle":"qa-b72e4be13cc8","displayName":"QA b72e4be13cc8","region":"eu","role":"user","createdAt":"2026-10-23T07:42:05.938856834Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-33231ec5-7b10-4f7a-89d8-f30716c077f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33231ec5-7b10-4f7a-89d8-f30716c077f6
Content-Type: application/json

--- request body ---
{"handle":"qa-5f4e20d3603d","displayName":"QA 5f4e20d3603d","password":"****","region":"eu"}

--- response: 201 in 126 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-33231ec5-7b10-4f7a-89d8-f30716c077f6
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
Location: /v1/accounts/qa-5f4e20d3603d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a887594c-cab2-49f9-ad09-82c46a732bca","handle":"qa-5f4e20d3603d","displayName":"QA 5f4e20d3603d","region":"eu","role":"user","createdAt":"2026-10-23T07:42:06.398019884Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-09a3af2e-e28e-4e17-bc0f-68c5ab68cb3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09a3af2e-e28e-4e17-bc0f-68c5ab68cb3b
Content-Type: application/json

--- request body ---
{"handle":"qa-b72e4be13cc8","password":"****"}

--- response: 200 in 32 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-09a3af2e-e28e-4e17-bc0f-68c5ab68cb3b
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_836f23b5-4b5d-42d8-9b41-7f25e25b05fe"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-161fafed-0bdf-4465-899e-194d49da5d5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-161fafed-0bdf-4465-899e-194d49da5d5e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5f4e20d3603d","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 64 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-161fafed-0bdf-4465-899e-194d49da5d5e
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
Location: /v1/conversations/cnv_b1791526-25e9-47b3-81a5-e2726909be59
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_b1791526-25e9-47b3-81a5-e2726909be59","subject":"Lunch?","status":"open","region":"eu","participants":["qa-b72e4be13cc8","qa-5f4e20d3603d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-23T07:42:06.525483471Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-3b254b08-8203-4d8e-9da0-df1b3e82ce03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b254b08-8203-4d8e-9da0-df1b3e82ce03
Content-Type: application/json

--- request body ---
{"handle":"qa-5f4e20d3603d","password":"****"}

--- response: 200 in 42 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b254b08-8203-4d8e-9da0-df1b3e82ce03
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a887594c-cab2-49f9-ad09-82c46a732bca"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_b1791526-25e9-47b3-81a5-e2726909be59/messages
correlation: qa-9ff214ae-5132-4db5-9d15-3808bbcfba2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ff214ae-5132-4db5-9d15-3808bbcfba2d
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 29 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ff214ae-5132-4db5-9d15-3808bbcfba2d
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

{"id":"msg_9f7b1f69-decc-473e-9add-e90d3e23487e","conversationId":"cnv_b1791526-25e9-47b3-81a5-e2726909be59","sender":"qa-5f4e20d3603d","body":"Friday works","createdAt":"2026-10-23T07:42:06.714796570Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_b1791526-25e9-47b3-81a5-e2726909be59/messages
correlation: qa-a86ae66d-7c6e-4119-ae7f-40d3e0756a14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a86ae66d-7c6e-4119-ae7f-40d3e0756a14
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-a86ae66d-7c6e-4119-ae7f-40d3e0756a14
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

{"items":[{"id":"msg_acef4ef8-0022-4590-9057-885b685ae2a6","conversationId":"cnv_b1791526-25e9-47b3-81a5-e2726909be59","sender":"qa-b72e4be13cc8","body":"Free on Friday?","createdAt":"2026-10-23T07:42:06.525732889Z"},{"id":"msg_9f7b1f69-decc-473e-9add-e90d3e23487e","conversationId":"cnv_b1791526-25e9-47b3-81a5-e2726909be59","sender":"qa-5f4e20d3603d","body":"Friday works","createdAt":"2026-10-23T07:42:06.714796570Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-678044e8-4014-4996-9add-1f5ef93f8897

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-678044e8-4014-4996-9add-1f5ef93f8897
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-678044e8-4014-4996-9add-1f5ef93f8897
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
correlation: qa-46bccfd2-0a73-4f29-82b3-151b0a838c0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46bccfd2-0a73-4f29-82b3-151b0a838c0f
Content-Type: application/json

--- request body ---
{"handle":"qa-5f4e20d3603d","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-46bccfd2-0a73-4f29-82b3-151b0a838c0f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-46bccfd2-0a73-4f29-82b3-151b0a838c0f"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6ef5c9ef-21d5-47b3-9e41-06c28026ff5e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ef5c9ef-21d5-47b3-9e41-06c28026ff5e
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6ef5c9ef-21d5-47b3-9e41-06c28026ff5e
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
correlation: qa-6453cddb-789d-4432-b5f4-a8c86b559dca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6453cddb-789d-4432-b5f4-a8c86b559dca
Content-Type: application/json

--- request body ---
{"handle":"qa-b72e4be13cc8","password":"****"}

--- response: 401 in 12 ms ---
Date: Fri, 23 Oct 2026 07:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6453cddb-789d-4432-b5f4-a8c86b559dca
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6453cddb-789d-4432-b5f4-a8c86b559dca"}
```
