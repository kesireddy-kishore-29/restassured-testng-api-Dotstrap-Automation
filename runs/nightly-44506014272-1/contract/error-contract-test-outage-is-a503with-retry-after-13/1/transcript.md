# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 53 | `qa-e26eedf1-33b9-40f9-abb9-5ed058d3118a` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-9ce65f29-1fc1-4331-98fb-3456ec910d71` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-baf768f2-d18a-41b0-aae8-05c3784dd856` |
| 4 | `POST /v1/conversations` | 201 | 29 | `qa-e80e74f7-5cb0-4550-bb15-466200ad833b` |
| 5 | `GET /v1/credits/balance` | 503 | 36 | `qa-48835325-8986-47a8-bb73-7d9e58d2b185` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-445cdcce-6eed-481d-9be8-8c7aa668ce1f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-2b7b0bff-9b0f-4824-8a22-59a3997f964a` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-083c3115-6620-4387-9fdc-5208c9fa2755` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-c08267c7-0a56-46cb-9d41-cf4f07e6e424` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-7f3839ce-b267-46bf-a2e9-ceb5de9f89bf` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e26eedf1-33b9-40f9-abb9-5ed058d3118a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e26eedf1-33b9-40f9-abb9-5ed058d3118a
Content-Type: application/json

--- request body ---
{"handle":"qa-d8bb0be44591","displayName":"QA d8bb0be44591","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-e26eedf1-33b9-40f9-abb9-5ed058d3118a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 6
Location: /v1/accounts/qa-d8bb0be44591
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8d4d42df-e257-470e-94b5-56883d43f95f","handle":"qa-d8bb0be44591","displayName":"QA d8bb0be44591","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.773749072Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9ce65f29-1fc1-4331-98fb-3456ec910d71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ce65f29-1fc1-4331-98fb-3456ec910d71
Content-Type: application/json

--- request body ---
{"handle":"qa-82e92f12a557","displayName":"QA 82e92f12a557","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ce65f29-1fc1-4331-98fb-3456ec910d71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 353
RateLimit-Reset: 6
Location: /v1/accounts/qa-82e92f12a557
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5e96095f-9514-40dd-8674-627c62b35d86","handle":"qa-82e92f12a557","displayName":"QA 82e92f12a557","region":"eu","role":"user","createdAt":"2026-11-19T10:29:26.835486229Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-baf768f2-d18a-41b0-aae8-05c3784dd856

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-baf768f2-d18a-41b0-aae8-05c3784dd856
Content-Type: application/json

--- request body ---
{"handle":"qa-d8bb0be44591","password":"****"}

--- response: 200 in 34 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-baf768f2-d18a-41b0-aae8-05c3784dd856
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8d4d42df-e257-470e-94b5-56883d43f95f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e80e74f7-5cb0-4550-bb15-466200ad833b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e80e74f7-5cb0-4550-bb15-466200ad833b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-82e92f12a557","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-e80e74f7-5cb0-4550-bb15-466200ad833b
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
Location: /v1/conversations/cnv_a7cd1134-2077-4358-b7d5-01d5a6079b58
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a7cd1134-2077-4358-b7d5-01d5a6079b58","subject":"Error contract","status":"open","region":"eu","participants":["qa-d8bb0be44591","qa-82e92f12a557"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:26.950069159Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-48835325-8986-47a8-bb73-7d9e58d2b185

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 66b16db4-6dea-4b06-b51d-7b43c2c706f9
X-Correlation-Id: qa-48835325-8986-47a8-bb73-7d9e58d2b185
Content-Type: application/json

--- response: 503 in 36 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48835325-8986-47a8-bb73-7d9e58d2b185
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-48835325-8986-47a8-bb73-7d9e58d2b185"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-445cdcce-6eed-481d-9be8-8c7aa668ce1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-445cdcce-6eed-481d-9be8-8c7aa668ce1f
Content-Type: application/json

--- request body ---
{"handle":"qa-82e92f12a557","password":"****"}

--- response: 200 in 35 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-445cdcce-6eed-481d-9be8-8c7aa668ce1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 335
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5e96095f-9514-40dd-8674-627c62b35d86"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2b7b0bff-9b0f-4824-8a22-59a3997f964a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b7b0bff-9b0f-4824-8a22-59a3997f964a
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2b7b0bff-9b0f-4824-8a22-59a3997f964a
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-083c3115-6620-4387-9fdc-5208c9fa2755

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-083c3115-6620-4387-9fdc-5208c9fa2755
Content-Type: application/json

--- request body ---
{"handle":"qa-82e92f12a557","password":"****"}

--- response: 401 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-083c3115-6620-4387-9fdc-5208c9fa2755
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-083c3115-6620-4387-9fdc-5208c9fa2755"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c08267c7-0a56-46cb-9d41-cf4f07e6e424

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c08267c7-0a56-46cb-9d41-cf4f07e6e424
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c08267c7-0a56-46cb-9d41-cf4f07e6e424
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-7f3839ce-b267-46bf-a2e9-ceb5de9f89bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f3839ce-b267-46bf-a2e9-ceb5de9f89bf
Content-Type: application/json

--- request body ---
{"handle":"qa-d8bb0be44591","password":"****"}

--- response: 401 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7f3839ce-b267-46bf-a2e9-ceb5de9f89bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 327
RateLimit-Reset: 5
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7f3839ce-b267-46bf-a2e9-ceb5de9f89bf"}
```
