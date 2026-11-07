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
| 1 | `POST /v1/accounts` | 201 | 430 | `qa-31a82092-f872-4442-8e70-0868d0aaf158` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-87628038-ae06-4d60-8a88-f31c4d357492` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-f8ad3e08-7d08-42c0-a85f-6c311d370b0a` |
| 4 | `POST /v1/conversations` | 201 | 58 | `qa-9907e96f-fcea-4b07-98dd-93486ba57ef8` |
| 5 | `POST /v1/auth/token` | 200 | 35 | `qa-fc5f2fe0-13cd-4f1f-8e0c-73a8aa6ebf7c` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 31 | `qa-db94c307-3a13-4e42-8d2a-95a5a6b7b90e` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 14 | `qa-c1eee509-11f1-4229-8250-e81a890a8ec5` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-b8236ac7-7c7e-44f8-8943-2586fb6df2e9` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-9d09dcb8-28de-442a-9367-ff4ea8b74294` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-0c8bbbf8-1994-4313-abab-98013209e3be` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-44ea549e-7cc6-4554-86b9-f762126c9657` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-31a82092-f872-4442-8e70-0868d0aaf158

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31a82092-f872-4442-8e70-0868d0aaf158
Content-Type: application/json

--- request body ---
{"handle":"qa-f8b7a17e1254","displayName":"QA f8b7a17e1254","password":"****","region":"eu"}

--- response: 201 in 430 ms ---
Date: Sun, 01 Nov 2026 09:23:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-31a82092-f872-4442-8e70-0868d0aaf158
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
Location: /v1/accounts/qa-f8b7a17e1254
X-Served-Region: eu
Content-Length: 181

{"id":"acc_61576312-d443-4937-9990-cf1243e6bfaf","handle":"qa-f8b7a17e1254","displayName":"QA f8b7a17e1254","region":"eu","role":"user","createdAt":"2026-11-01T09:23:26.933880954Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-87628038-ae06-4d60-8a88-f31c4d357492

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87628038-ae06-4d60-8a88-f31c4d357492
Content-Type: application/json

--- request body ---
{"handle":"qa-073ba827f3e7","displayName":"QA 073ba827f3e7","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-87628038-ae06-4d60-8a88-f31c4d357492
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
Location: /v1/accounts/qa-073ba827f3e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_24041a98-6774-461d-b32c-09af925a65b0","handle":"qa-073ba827f3e7","displayName":"QA 073ba827f3e7","region":"eu","role":"user","createdAt":"2026-11-01T09:23:27.369517997Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f8ad3e08-7d08-42c0-a85f-6c311d370b0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8ad3e08-7d08-42c0-a85f-6c311d370b0a
Content-Type: application/json

--- request body ---
{"handle":"qa-f8b7a17e1254","password":"****"}

--- response: 200 in 26 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-f8ad3e08-7d08-42c0-a85f-6c311d370b0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_61576312-d443-4937-9990-cf1243e6bfaf"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9907e96f-fcea-4b07-98dd-93486ba57ef8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9907e96f-fcea-4b07-98dd-93486ba57ef8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-073ba827f3e7","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 58 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-9907e96f-fcea-4b07-98dd-93486ba57ef8
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
Location: /v1/conversations/cnv_922d843b-798c-45c4-b08b-7d3b1eb09f31
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_922d843b-798c-45c4-b08b-7d3b1eb09f31","subject":"Lunch?","status":"open","region":"eu","participants":["qa-f8b7a17e1254","qa-073ba827f3e7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:27.528956975Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-fc5f2fe0-13cd-4f1f-8e0c-73a8aa6ebf7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc5f2fe0-13cd-4f1f-8e0c-73a8aa6ebf7c
Content-Type: application/json

--- request body ---
{"handle":"qa-073ba827f3e7","password":"****"}

--- response: 200 in 35 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc5f2fe0-13cd-4f1f-8e0c-73a8aa6ebf7c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_24041a98-6774-461d-b32c-09af925a65b0"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_922d843b-798c-45c4-b08b-7d3b1eb09f31/messages
correlation: qa-db94c307-3a13-4e42-8d2a-95a5a6b7b90e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db94c307-3a13-4e42-8d2a-95a5a6b7b90e
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 31 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-db94c307-3a13-4e42-8d2a-95a5a6b7b90e
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

{"id":"msg_ca5aa86b-3d39-413d-a534-eb279727bcd1","conversationId":"cnv_922d843b-798c-45c4-b08b-7d3b1eb09f31","sender":"qa-073ba827f3e7","body":"Friday works","createdAt":"2026-11-01T09:23:27.695344690Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_922d843b-798c-45c4-b08b-7d3b1eb09f31/messages
correlation: qa-c1eee509-11f1-4229-8250-e81a890a8ec5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1eee509-11f1-4229-8250-e81a890a8ec5
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1eee509-11f1-4229-8250-e81a890a8ec5
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

{"items":[{"id":"msg_8f67aae0-4569-4cd7-8900-ec3fc9482fc7","conversationId":"cnv_922d843b-798c-45c4-b08b-7d3b1eb09f31","sender":"qa-f8b7a17e1254","body":"Free on Friday?","createdAt":"2026-11-01T09:23:27.530488609Z"},{"id":"msg_ca5aa86b-3d39-413d-a534-eb279727bcd1","conversationId":"cnv_922d843b-798c-45c4-b08b-7d3b1eb09f31","sender":"qa-073ba827f3e7","body":"Friday works","createdAt":"2026-11-01T09:23:27.695344690Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b8236ac7-7c7e-44f8-8943-2586fb6df2e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8236ac7-7c7e-44f8-8943-2586fb6df2e9
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b8236ac7-7c7e-44f8-8943-2586fb6df2e9
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
correlation: qa-9d09dcb8-28de-442a-9367-ff4ea8b74294

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d09dcb8-28de-442a-9367-ff4ea8b74294
Content-Type: application/json

--- request body ---
{"handle":"qa-073ba827f3e7","password":"****"}

--- response: 401 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d09dcb8-28de-442a-9367-ff4ea8b74294
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9d09dcb8-28de-442a-9367-ff4ea8b74294"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0c8bbbf8-1994-4313-abab-98013209e3be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c8bbbf8-1994-4313-abab-98013209e3be
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0c8bbbf8-1994-4313-abab-98013209e3be
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
correlation: qa-44ea549e-7cc6-4554-86b9-f762126c9657

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44ea549e-7cc6-4554-86b9-f762126c9657
Content-Type: application/json

--- request body ---
{"handle":"qa-f8b7a17e1254","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-44ea549e-7cc6-4554-86b9-f762126c9657
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-44ea549e-7cc6-4554-86b9-f762126c9657"}
```
