# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/close]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[12]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-89d6c9b0-95c8-430c-bdd8-d67cc0888620` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-3612e23c-2613-4c99-a6f8-26fe3cf8a048` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-e28bcb58-9357-44b6-a2c0-255aac1e090d` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-0457b25f-2c19-4689-a97d-1d8e4de1ce08` |
| 5 | `POST /v1/conversations/{id}/close` | 503 | 16 | `qa-90f74278-c736-443d-ad36-b08ecce258d0` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-2118ed2f-b4d5-4aac-b20c-65989f75c4a1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-fa8fb1bb-7a58-4a5d-a8c6-ef703378cd85` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-4845a343-3f49-4e76-a7ea-2fdeb2321153` |
| 9 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-a042c6db-c8a4-48a9-9d17-228aecec3b8d` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-577d3f42-c516-40e8-aff4-f1946e11b361` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-89d6c9b0-95c8-430c-bdd8-d67cc0888620

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89d6c9b0-95c8-430c-bdd8-d67cc0888620
Content-Type: application/json

--- request body ---
{"handle":"qa-a8c3c679207f","displayName":"QA a8c3c679207f","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-89d6c9b0-95c8-430c-bdd8-d67cc0888620
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 7
Location: /v1/accounts/qa-a8c3c679207f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7764aa83-a38b-4dec-b197-b153edf2682b","handle":"qa-a8c3c679207f","displayName":"QA a8c3c679207f","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.419996541Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3612e23c-2613-4c99-a6f8-26fe3cf8a048

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3612e23c-2613-4c99-a6f8-26fe3cf8a048
Content-Type: application/json

--- request body ---
{"handle":"qa-c9035553719a","displayName":"QA c9035553719a","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-3612e23c-2613-4c99-a6f8-26fe3cf8a048
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 7
Location: /v1/accounts/qa-c9035553719a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fdc8bdd6-9222-4be8-8d6b-06bfeaec76c3","handle":"qa-c9035553719a","displayName":"QA c9035553719a","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.461418166Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e28bcb58-9357-44b6-a2c0-255aac1e090d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e28bcb58-9357-44b6-a2c0-255aac1e090d
Content-Type: application/json

--- request body ---
{"handle":"qa-a8c3c679207f","password":"****"}

--- response: 200 in 36 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-e28bcb58-9357-44b6-a2c0-255aac1e090d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7764aa83-a38b-4dec-b197-b153edf2682b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0457b25f-2c19-4689-a97d-1d8e4de1ce08

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0457b25f-2c19-4689-a97d-1d8e4de1ce08
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c9035553719a","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-0457b25f-2c19-4689-a97d-1d8e4de1ce08
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
Location: /v1/conversations/cnv_74275c17-522c-4cc1-9ff0-5bb9ce37f63b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_74275c17-522c-4cc1-9ff0-5bb9ce37f63b","subject":"Error contract","status":"open","region":"eu","participants":["qa-a8c3c679207f","qa-c9035553719a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:23.551210180Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_74275c17-522c-4cc1-9ff0-5bb9ce37f63b/close
correlation: qa-90f74278-c736-443d-ad36-b08ecce258d0

--- request headers ---
Accept: application/json
X-Fault-Key: e06ef623-502d-4682-ac34-6a2982b12cca
X-Fault: unavailable-once
X-Correlation-Id: qa-90f74278-c736-443d-ad36-b08ecce258d0
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-90f74278-c736-443d-ad36-b08ecce258d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 308

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_74275c17-522c-4cc1-9ff0-5bb9ce37f63b/close","correlationId":"qa-90f74278-c736-443d-ad36-b08ecce258d0"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-2118ed2f-b4d5-4aac-b20c-65989f75c4a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2118ed2f-b4d5-4aac-b20c-65989f75c4a1
Content-Type: application/json

--- request body ---
{"handle":"qa-c9035553719a","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-2118ed2f-b4d5-4aac-b20c-65989f75c4a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 361
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fdc8bdd6-9222-4be8-8d6b-06bfeaec76c3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fa8fb1bb-7a58-4a5d-a8c6-ef703378cd85

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fa8fb1bb-7a58-4a5d-a8c6-ef703378cd85
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fa8fb1bb-7a58-4a5d-a8c6-ef703378cd85
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
correlation: qa-4845a343-3f49-4e76-a7ea-2fdeb2321153

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4845a343-3f49-4e76-a7ea-2fdeb2321153
Content-Type: application/json

--- request body ---
{"handle":"qa-c9035553719a","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4845a343-3f49-4e76-a7ea-2fdeb2321153
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 355
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4845a343-3f49-4e76-a7ea-2fdeb2321153"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a042c6db-c8a4-48a9-9d17-228aecec3b8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a042c6db-c8a4-48a9-9d17-228aecec3b8d
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a042c6db-c8a4-48a9-9d17-228aecec3b8d
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
correlation: qa-577d3f42-c516-40e8-aff4-f1946e11b361

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-577d3f42-c516-40e8-aff4-f1946e11b361
Content-Type: application/json

--- request body ---
{"handle":"qa-a8c3c679207f","password":"****"}

--- response: 401 in 15 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-577d3f42-c516-40e8-aff4-f1946e11b361
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 350
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-577d3f42-c516-40e8-aff4-f1946e11b361"}
```
