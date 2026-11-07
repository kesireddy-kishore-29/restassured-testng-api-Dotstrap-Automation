# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[9]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-1966f42d-e80d-4ac7-9980-a7485894461d` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-0b670044-a94c-48ba-9f80-9d7ef5968413` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-9deb6c29-65d8-4a36-b43b-109666b4c4a5` |
| 4 | `POST /v1/conversations` | 201 | 22 | `qa-99448884-d6c0-4611-8800-284d6318db9f` |
| 5 | `GET /v1/conversations/{id}/messages` | 503 | 30 | `qa-a825c0f2-b5bb-45d2-9252-42d93193fd8f` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-9882e9fe-9bfc-4927-a62e-258c197d95d6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-7bc6ce4c-4a3c-41fb-88b6-30f0e75a7fdf` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-e0a41eb2-a13c-400f-8301-8a947ce4cb16` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-6f235b1b-2cb7-4bf1-acfa-4aff40e6643f` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-81affde6-2dec-4ef9-ba29-66bec26db734` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1966f42d-e80d-4ac7-9980-a7485894461d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1966f42d-e80d-4ac7-9980-a7485894461d
Content-Type: application/json

--- request body ---
{"handle":"qa-9c7e22fd6196","displayName":"QA 9c7e22fd6196","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-1966f42d-e80d-4ac7-9980-a7485894461d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 8
Location: /v1/accounts/qa-9c7e22fd6196
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d0800187-cdc5-437a-bcd2-fe5ee1023db0","handle":"qa-9c7e22fd6196","displayName":"QA 9c7e22fd6196","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.999764357Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0b670044-a94c-48ba-9f80-9d7ef5968413

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b670044-a94c-48ba-9f80-9d7ef5968413
Content-Type: application/json

--- request body ---
{"handle":"qa-3c6628c85027","displayName":"QA 3c6628c85027","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b670044-a94c-48ba-9f80-9d7ef5968413
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Location: /v1/accounts/qa-3c6628c85027
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bc05abbb-32b0-4138-a1ae-f58aa990ecc5","handle":"qa-3c6628c85027","displayName":"QA 3c6628c85027","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.053038987Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9deb6c29-65d8-4a36-b43b-109666b4c4a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9deb6c29-65d8-4a36-b43b-109666b4c4a5
Content-Type: application/json

--- request body ---
{"handle":"qa-9c7e22fd6196","password":"****"}

--- response: 200 in 33 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-9deb6c29-65d8-4a36-b43b-109666b4c4a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 419
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d0800187-cdc5-437a-bcd2-fe5ee1023db0"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-99448884-d6c0-4611-8800-284d6318db9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99448884-d6c0-4611-8800-284d6318db9f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3c6628c85027","subject":"Error contract","message":"Hi"}

--- response: 201 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-99448884-d6c0-4611-8800-284d6318db9f
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
Location: /v1/conversations/cnv_95ace73f-f4d9-476d-8e3d-64b00af4eb60
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_95ace73f-f4d9-476d-8e3d-64b00af4eb60","subject":"Error contract","status":"open","region":"eu","participants":["qa-9c7e22fd6196","qa-3c6628c85027"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:23.138796660Z"}
```

## 5. GET /v1/conversations/{id}/messages

```text
#5 GET http://localhost:7070/v1/conversations/cnv_95ace73f-f4d9-476d-8e3d-64b00af4eb60/messages
correlation: qa-a825c0f2-b5bb-45d2-9252-42d93193fd8f

--- request headers ---
Accept: application/json
X-Fault-Key: 01f0d996-0ed4-464c-82df-e685a3ed72fc
X-Fault: unavailable-once
X-Correlation-Id: qa-a825c0f2-b5bb-45d2-9252-42d93193fd8f
Content-Type: application/json

--- response: 503 in 30 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a825c0f2-b5bb-45d2-9252-42d93193fd8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_95ace73f-f4d9-476d-8e3d-64b00af4eb60/messages","correlationId":"qa-a825c0f2-b5bb-45d2-9252-42d93193fd8f"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9882e9fe-9bfc-4927-a62e-258c197d95d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9882e9fe-9bfc-4927-a62e-258c197d95d6
Content-Type: application/json

--- request body ---
{"handle":"qa-3c6628c85027","password":"****"}

--- response: 200 in 22 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-9882e9fe-9bfc-4927-a62e-258c197d95d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 406
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bc05abbb-32b0-4138-a1ae-f58aa990ecc5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7bc6ce4c-4a3c-41fb-88b6-30f0e75a7fdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bc6ce4c-4a3c-41fb-88b6-30f0e75a7fdf
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7bc6ce4c-4a3c-41fb-88b6-30f0e75a7fdf
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
correlation: qa-e0a41eb2-a13c-400f-8301-8a947ce4cb16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0a41eb2-a13c-400f-8301-8a947ce4cb16
Content-Type: application/json

--- request body ---
{"handle":"qa-3c6628c85027","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0a41eb2-a13c-400f-8301-8a947ce4cb16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e0a41eb2-a13c-400f-8301-8a947ce4cb16"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6f235b1b-2cb7-4bf1-acfa-4aff40e6643f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f235b1b-2cb7-4bf1-acfa-4aff40e6643f
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6f235b1b-2cb7-4bf1-acfa-4aff40e6643f
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
correlation: qa-81affde6-2dec-4ef9-ba29-66bec26db734

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81affde6-2dec-4ef9-ba29-66bec26db734
Content-Type: application/json

--- request body ---
{"handle":"qa-9c7e22fd6196","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81affde6-2dec-4ef9-ba29-66bec26db734
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 395
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-81affde6-2dec-4ef9-ba29-66bec26db734"}
```
