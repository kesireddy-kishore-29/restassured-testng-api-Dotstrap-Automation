# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-12493a53-cbc3-4fad-9c45-be5d00f89aed` |
| 2 | `POST /v1/accounts` | 201 | 50 | `qa-e970a056-0cd2-4081-87f2-2ce0b614d915` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-f20bd1f5-1d48-437a-8f1a-45177fe3f92d` |
| 4 | `POST /v1/conversations` | 201 | 47 | `qa-601f0122-08e0-418e-acc9-bdbbb9797b44` |
| 5 | `DELETE /v1/accounts/me` | 503 | 22 | `qa-ff4faf3b-951b-4487-8a8e-52d3ed65e92e` |
| 6 | `POST /v1/auth/token` | 200 | 41 | `qa-9a978e01-0444-425c-ba76-f321c9cb4e10` |
| 7 | `DELETE /v1/accounts/me` | 204 | 44 | `qa-e50d7517-89cc-4045-9cf4-fde656b3b5d6` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-71fed5a7-60d0-4247-926e-092d6cb5ae6d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-606bc7f2-a5d0-4b91-afcb-73f16c9e293b` |
| 10 | `POST /v1/auth/token` | 401 | 15 | `qa-807fed72-13c7-46f4-a328-9fd9b8fc7444` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-12493a53-cbc3-4fad-9c45-be5d00f89aed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12493a53-cbc3-4fad-9c45-be5d00f89aed
Content-Type: application/json

--- request body ---
{"handle":"qa-f42553946f14","displayName":"QA f42553946f14","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-12493a53-cbc3-4fad-9c45-be5d00f89aed
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
Location: /v1/accounts/qa-f42553946f14
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5701371c-141d-4b6d-bd7e-0b511697eb28","handle":"qa-f42553946f14","displayName":"QA f42553946f14","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.819443915Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e970a056-0cd2-4081-87f2-2ce0b614d915

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e970a056-0cd2-4081-87f2-2ce0b614d915
Content-Type: application/json

--- request body ---
{"handle":"qa-d86b2ed36364","displayName":"QA d86b2ed36364","password":"****","region":"eu"}

--- response: 201 in 50 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e970a056-0cd2-4081-87f2-2ce0b614d915
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Location: /v1/accounts/qa-d86b2ed36364
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c302d7a6-3e2e-443b-b4b2-090946422724","handle":"qa-d86b2ed36364","displayName":"QA d86b2ed36364","region":"eu","role":"user","createdAt":"2026-10-30T08:46:03.887108094Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f20bd1f5-1d48-437a-8f1a-45177fe3f92d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f20bd1f5-1d48-437a-8f1a-45177fe3f92d
Content-Type: application/json

--- request body ---
{"handle":"qa-f42553946f14","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f20bd1f5-1d48-437a-8f1a-45177fe3f92d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 482
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5701371c-141d-4b6d-bd7e-0b511697eb28"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-601f0122-08e0-418e-acc9-bdbbb9797b44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-601f0122-08e0-418e-acc9-bdbbb9797b44
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d86b2ed36364","subject":"Error contract","message":"Hi"}

--- response: 201 in 47 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-601f0122-08e0-418e-acc9-bdbbb9797b44
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
Location: /v1/conversations/cnv_602e4a52-ff32-4072-b690-5829a1be0399
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_602e4a52-ff32-4072-b690-5829a1be0399","subject":"Error contract","status":"open","region":"eu","participants":["qa-f42553946f14","qa-d86b2ed36364"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-30T08:46:04.033915777Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ff4faf3b-951b-4487-8a8e-52d3ed65e92e

--- request headers ---
Accept: application/json
X-Fault-Key: e4e28643-00d1-410d-b19f-6b6989309216
X-Fault: unavailable-once
X-Correlation-Id: qa-ff4faf3b-951b-4487-8a8e-52d3ed65e92e
Content-Type: application/json

--- response: 503 in 22 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff4faf3b-951b-4487-8a8e-52d3ed65e92e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-ff4faf3b-951b-4487-8a8e-52d3ed65e92e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9a978e01-0444-425c-ba76-f321c9cb4e10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a978e01-0444-425c-ba76-f321c9cb4e10
Content-Type: application/json

--- request body ---
{"handle":"qa-d86b2ed36364","password":"****"}

--- response: 200 in 41 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a978e01-0444-425c-ba76-f321c9cb4e10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 465
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c302d7a6-3e2e-443b-b4b2-090946422724"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e50d7517-89cc-4045-9cf4-fde656b3b5d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e50d7517-89cc-4045-9cf4-fde656b3b5d6
Content-Type: application/json

--- response: 204 in 44 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e50d7517-89cc-4045-9cf4-fde656b3b5d6
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
correlation: qa-71fed5a7-60d0-4247-926e-092d6cb5ae6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71fed5a7-60d0-4247-926e-092d6cb5ae6d
Content-Type: application/json

--- request body ---
{"handle":"qa-d86b2ed36364","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71fed5a7-60d0-4247-926e-092d6cb5ae6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-71fed5a7-60d0-4247-926e-092d6cb5ae6d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-606bc7f2-a5d0-4b91-afcb-73f16c9e293b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-606bc7f2-a5d0-4b91-afcb-73f16c9e293b
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-606bc7f2-a5d0-4b91-afcb-73f16c9e293b
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
correlation: qa-807fed72-13c7-46f4-a328-9fd9b8fc7444

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-807fed72-13c7-46f4-a328-9fd9b8fc7444
Content-Type: application/json

--- request body ---
{"handle":"qa-f42553946f14","password":"****"}

--- response: 401 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-807fed72-13c7-46f4-a328-9fd9b8fc7444
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-807fed72-13c7-46f4-a328-9fd9b8fc7444"}
```
