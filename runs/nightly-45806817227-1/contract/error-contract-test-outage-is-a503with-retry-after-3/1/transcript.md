# Transcript: Every operation answers an outage with a 503 problem and Retry-After [PATCH /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[3]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 65 | `qa-f61bc740-b8f4-472f-8866-3f431d8383b7` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-fac36d61-45d8-4362-9225-6f0e4bae5176` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-c29343e5-649f-4403-ae1a-1ce8215a0656` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-6577f950-a9e7-480e-8127-472c771fde4b` |
| 5 | `PATCH /v1/accounts/me` | 503 | 17 | `qa-c13bbbb9-46a6-4f31-9bb8-ed52a5a6b689` |
| 6 | `POST /v1/auth/token` | 200 | 48 | `qa-653dacab-cc38-42ed-8601-691e9b85d6af` |
| 7 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-dcf0600e-b16a-40e6-b5d5-d38b3ca98a2a` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-c64b8673-13ea-433a-a59d-64275fada338` |
| 9 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-6725692f-a2ae-43cc-a7b3-2d4b75fb7158` |
| 10 | `POST /v1/auth/token` | 401 | 22 | `qa-4a3b8bf4-be6d-430e-9ab1-4c8683b9d1fa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f61bc740-b8f4-472f-8866-3f431d8383b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f61bc740-b8f4-472f-8866-3f431d8383b7
Content-Type: application/json

--- request body ---
{"handle":"qa-c259dc61aad7","displayName":"QA c259dc61aad7","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-f61bc740-b8f4-472f-8866-3f431d8383b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Location: /v1/accounts/qa-c259dc61aad7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_05866c74-b9a2-48a8-a4cf-173127df7e3d","handle":"qa-c259dc61aad7","displayName":"QA c259dc61aad7","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.625066673Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fac36d61-45d8-4362-9225-6f0e4bae5176

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fac36d61-45d8-4362-9225-6f0e4bae5176
Content-Type: application/json

--- request body ---
{"handle":"qa-1d823b2df6ec","displayName":"QA 1d823b2df6ec","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-fac36d61-45d8-4362-9225-6f0e4bae5176
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 9
Location: /v1/accounts/qa-1d823b2df6ec
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c965ce40-364a-4870-89d1-df9b7b64b494","handle":"qa-1d823b2df6ec","displayName":"QA 1d823b2df6ec","region":"eu","role":"user","createdAt":"2026-11-26T11:02:43.689158480Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c29343e5-649f-4403-ae1a-1ce8215a0656

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c29343e5-649f-4403-ae1a-1ce8215a0656
Content-Type: application/json

--- request body ---
{"handle":"qa-c259dc61aad7","password":"****"}

--- response: 200 in 26 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-c29343e5-649f-4403-ae1a-1ce8215a0656
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_05866c74-b9a2-48a8-a4cf-173127df7e3d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6577f950-a9e7-480e-8127-472c771fde4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6577f950-a9e7-480e-8127-472c771fde4b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1d823b2df6ec","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-6577f950-a9e7-480e-8127-472c771fde4b
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
Location: /v1/conversations/cnv_f6c10c42-6cf5-4646-a53f-9b1196d859f8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f6c10c42-6cf5-4646-a53f-9b1196d859f8","subject":"Error contract","status":"open","region":"eu","participants":["qa-c259dc61aad7","qa-1d823b2df6ec"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:43.782109137Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-c13bbbb9-46a6-4f31-9bb8-ed52a5a6b689

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: ca683a97-a380-4f37-8cba-9a343f5ff228
X-Correlation-Id: qa-c13bbbb9-46a6-4f31-9bb8-ed52a5a6b689
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c13bbbb9-46a6-4f31-9bb8-ed52a5a6b689
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-c13bbbb9-46a6-4f31-9bb8-ed52a5a6b689"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-653dacab-cc38-42ed-8601-691e9b85d6af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-653dacab-cc38-42ed-8601-691e9b85d6af
Content-Type: application/json

--- request body ---
{"handle":"qa-1d823b2df6ec","password":"****"}

--- response: 200 in 48 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-653dacab-cc38-42ed-8601-691e9b85d6af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c965ce40-364a-4870-89d1-df9b7b64b494"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dcf0600e-b16a-40e6-b5d5-d38b3ca98a2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcf0600e-b16a-40e6-b5d5-d38b3ca98a2a
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dcf0600e-b16a-40e6-b5d5-d38b3ca98a2a
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
correlation: qa-c64b8673-13ea-433a-a59d-64275fada338

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c64b8673-13ea-433a-a59d-64275fada338
Content-Type: application/json

--- request body ---
{"handle":"qa-1d823b2df6ec","password":"****"}

--- response: 401 in 26 ms ---
Date: Thu, 26 Nov 2026 11:02:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c64b8673-13ea-433a-a59d-64275fada338
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c64b8673-13ea-433a-a59d-64275fada338"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6725692f-a2ae-43cc-a7b3-2d4b75fb7158

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6725692f-a2ae-43cc-a7b3-2d4b75fb7158
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6725692f-a2ae-43cc-a7b3-2d4b75fb7158
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-4a3b8bf4-be6d-430e-9ab1-4c8683b9d1fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a3b8bf4-be6d-430e-9ab1-4c8683b9d1fa
Content-Type: application/json

--- request body ---
{"handle":"qa-c259dc61aad7","password":"****"}

--- response: 401 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4a3b8bf4-be6d-430e-9ab1-4c8683b9d1fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4a3b8bf4-be6d-430e-9ab1-4c8683b9d1fa"}
```
