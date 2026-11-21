# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/ledger]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[14]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-94cab521-cc75-43b1-8d7d-4a4d1fc98fd7` |
| 2 | `POST /v1/accounts` | 201 | 25 | `qa-a64264b4-090a-4a70-bf5e-70e00de94bc3` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-65e7e5bb-0341-425e-aa5d-4aefc657ab3b` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-8936b759-43c2-4b5a-94ad-0f057625d65b` |
| 5 | `GET /v1/credits/ledger` | 503 | 23 | `qa-be0750e7-9764-442a-975c-96d5b4a3598d` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-52a98827-8ea6-4f69-a6ef-85e9338c318f` |
| 7 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-0ec6a0da-0cea-420f-b76f-cab31bccba86` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-74a8e66c-076f-4a13-9e74-2ea1cf7ee97e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-1c0b4fb4-c50a-4318-820a-b9b16c23f7b7` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-60b28d87-9529-4531-9dea-ea22b98092c2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-94cab521-cc75-43b1-8d7d-4a4d1fc98fd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94cab521-cc75-43b1-8d7d-4a4d1fc98fd7
Content-Type: application/json

--- request body ---
{"handle":"qa-8a00f9f71563","displayName":"QA 8a00f9f71563","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-94cab521-cc75-43b1-8d7d-4a4d1fc98fd7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 7
Location: /v1/accounts/qa-8a00f9f71563
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cfaf5cd8-91fb-42f2-8ea1-d08f2de6bef4","handle":"qa-8a00f9f71563","displayName":"QA 8a00f9f71563","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.801745396Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a64264b4-090a-4a70-bf5e-70e00de94bc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a64264b4-090a-4a70-bf5e-70e00de94bc3
Content-Type: application/json

--- request body ---
{"handle":"qa-6ea215b713c5","displayName":"QA 6ea215b713c5","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-a64264b4-090a-4a70-bf5e-70e00de94bc3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 7
Location: /v1/accounts/qa-6ea215b713c5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8187d979-8c3a-40fb-b361-99d328dc9db4","handle":"qa-6ea215b713c5","displayName":"QA 6ea215b713c5","region":"eu","role":"user","createdAt":"2026-11-17T10:50:19.861632590Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-65e7e5bb-0341-425e-aa5d-4aefc657ab3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65e7e5bb-0341-425e-aa5d-4aefc657ab3b
Content-Type: application/json

--- request body ---
{"handle":"qa-8a00f9f71563","password":"****"}

--- response: 200 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-65e7e5bb-0341-425e-aa5d-4aefc657ab3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cfaf5cd8-91fb-42f2-8ea1-d08f2de6bef4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8936b759-43c2-4b5a-94ad-0f057625d65b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8936b759-43c2-4b5a-94ad-0f057625d65b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6ea215b713c5","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-8936b759-43c2-4b5a-94ad-0f057625d65b
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
Location: /v1/conversations/cnv_f3cf4c05-ae11-454e-8851-ee62ed79edc7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f3cf4c05-ae11-454e-8851-ee62ed79edc7","subject":"Error contract","status":"open","region":"eu","participants":["qa-8a00f9f71563","qa-6ea215b713c5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:19.906602025Z"}
```

## 5. GET /v1/credits/ledger

```text
#5 GET http://localhost:7070/v1/credits/ledger
correlation: qa-be0750e7-9764-442a-975c-96d5b4a3598d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 1fc18200-1ef4-421b-8274-2e7f6aa11932
X-Correlation-Id: qa-be0750e7-9764-442a-975c-96d5b4a3598d
Content-Type: application/json

--- response: 503 in 23 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be0750e7-9764-442a-975c-96d5b4a3598d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 262

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/ledger","correlationId":"qa-be0750e7-9764-442a-975c-96d5b4a3598d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-52a98827-8ea6-4f69-a6ef-85e9338c318f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52a98827-8ea6-4f69-a6ef-85e9338c318f
Content-Type: application/json

--- request body ---
{"handle":"qa-6ea215b713c5","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-52a98827-8ea6-4f69-a6ef-85e9338c318f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8187d979-8c3a-40fb-b361-99d328dc9db4"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0ec6a0da-0cea-420f-b76f-cab31bccba86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ec6a0da-0cea-420f-b76f-cab31bccba86
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0ec6a0da-0cea-420f-b76f-cab31bccba86
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
correlation: qa-74a8e66c-076f-4a13-9e74-2ea1cf7ee97e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74a8e66c-076f-4a13-9e74-2ea1cf7ee97e
Content-Type: application/json

--- request body ---
{"handle":"qa-6ea215b713c5","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-74a8e66c-076f-4a13-9e74-2ea1cf7ee97e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-74a8e66c-076f-4a13-9e74-2ea1cf7ee97e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1c0b4fb4-c50a-4318-820a-b9b16c23f7b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c0b4fb4-c50a-4318-820a-b9b16c23f7b7
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1c0b4fb4-c50a-4318-820a-b9b16c23f7b7
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
correlation: qa-60b28d87-9529-4531-9dea-ea22b98092c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60b28d87-9529-4531-9dea-ea22b98092c2
Content-Type: application/json

--- request body ---
{"handle":"qa-8a00f9f71563","password":"****"}

--- response: 401 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60b28d87-9529-4531-9dea-ea22b98092c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-60b28d87-9529-4531-9dea-ea22b98092c2"}
```
