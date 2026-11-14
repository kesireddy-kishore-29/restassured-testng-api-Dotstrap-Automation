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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-69c902af-6242-4fff-9449-a574c17e61ea` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-300afa02-601d-4cdc-801e-96c38e957709` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-109dfee5-830f-4ac9-a2e6-d5812b74ad98` |
| 4 | `POST /v1/conversations` | 201 | 30 | `qa-2770a724-bddc-4599-98fd-62b0263724c0` |
| 5 | `PATCH /v1/accounts/me` | 503 | 23 | `qa-55d784e3-f4f8-4003-8d80-774d244c5d71` |
| 6 | `POST /v1/auth/token` | 200 | 36 | `qa-f9c63200-abbf-4a75-bc26-19c3412186f2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-d44012b8-1109-451a-a306-37f78d659d31` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-7ed5dfa0-56a4-4632-afaa-5d6ff2439c57` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-41e2f32f-3e7c-4c91-96e2-ffdb45184f37` |
| 10 | `POST /v1/auth/token` | 401 | 18 | `qa-fdda5832-d1cc-4c40-b75c-c98f2b0ee8dc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-69c902af-6242-4fff-9449-a574c17e61ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69c902af-6242-4fff-9449-a574c17e61ea
Content-Type: application/json

--- request body ---
{"handle":"qa-7be9570405ab","displayName":"QA 7be9570405ab","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-69c902af-6242-4fff-9449-a574c17e61ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Location: /v1/accounts/qa-7be9570405ab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b51ea222-3995-4dbf-aa22-0439239053bc","handle":"qa-7be9570405ab","displayName":"QA 7be9570405ab","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.694439538Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-300afa02-601d-4cdc-801e-96c38e957709

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-300afa02-601d-4cdc-801e-96c38e957709
Content-Type: application/json

--- request body ---
{"handle":"qa-c2a022d96c6e","displayName":"QA c2a022d96c6e","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-300afa02-601d-4cdc-801e-96c38e957709
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Location: /v1/accounts/qa-c2a022d96c6e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72fa181c-d5ef-46a0-ab1f-8e2b4c8240cd","handle":"qa-c2a022d96c6e","displayName":"QA c2a022d96c6e","region":"eu","role":"user","createdAt":"2026-11-08T09:09:01.729864336Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-109dfee5-830f-4ac9-a2e6-d5812b74ad98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-109dfee5-830f-4ac9-a2e6-d5812b74ad98
Content-Type: application/json

--- request body ---
{"handle":"qa-7be9570405ab","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-109dfee5-830f-4ac9-a2e6-d5812b74ad98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b51ea222-3995-4dbf-aa22-0439239053bc"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2770a724-bddc-4599-98fd-62b0263724c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2770a724-bddc-4599-98fd-62b0263724c0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c2a022d96c6e","subject":"Error contract","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-2770a724-bddc-4599-98fd-62b0263724c0
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
Location: /v1/conversations/cnv_51226a0b-10d3-460a-9883-84b59d19a870
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_51226a0b-10d3-460a-9883-84b59d19a870","subject":"Error contract","status":"open","region":"eu","participants":["qa-7be9570405ab","qa-c2a022d96c6e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:01.807038480Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-55d784e3-f4f8-4003-8d80-774d244c5d71

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: dfc3848e-d845-4858-a67a-0ea7961ad993
X-Correlation-Id: qa-55d784e3-f4f8-4003-8d80-774d244c5d71
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 503 in 23 ms ---
Date: Sun, 08 Nov 2026 09:09:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-55d784e3-f4f8-4003-8d80-774d244c5d71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-55d784e3-f4f8-4003-8d80-774d244c5d71"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f9c63200-abbf-4a75-bc26-19c3412186f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9c63200-abbf-4a75-bc26-19c3412186f2
Content-Type: application/json

--- request body ---
{"handle":"qa-c2a022d96c6e","password":"****"}

--- response: 200 in 36 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f9c63200-abbf-4a75-bc26-19c3412186f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72fa181c-d5ef-46a0-ab1f-8e2b4c8240cd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d44012b8-1109-451a-a306-37f78d659d31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d44012b8-1109-451a-a306-37f78d659d31
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d44012b8-1109-451a-a306-37f78d659d31
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
correlation: qa-7ed5dfa0-56a4-4632-afaa-5d6ff2439c57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ed5dfa0-56a4-4632-afaa-5d6ff2439c57
Content-Type: application/json

--- request body ---
{"handle":"qa-c2a022d96c6e","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ed5dfa0-56a4-4632-afaa-5d6ff2439c57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7ed5dfa0-56a4-4632-afaa-5d6ff2439c57"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-41e2f32f-3e7c-4c91-96e2-ffdb45184f37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41e2f32f-3e7c-4c91-96e2-ffdb45184f37
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-41e2f32f-3e7c-4c91-96e2-ffdb45184f37
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
correlation: qa-fdda5832-d1cc-4c40-b75c-c98f2b0ee8dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdda5832-d1cc-4c40-b75c-c98f2b0ee8dc
Content-Type: application/json

--- request body ---
{"handle":"qa-7be9570405ab","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 08 Nov 2026 09:09:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fdda5832-d1cc-4c40-b75c-c98f2b0ee8dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 495
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-fdda5832-d1cc-4c40-b75c-c98f2b0ee8dc"}
```
