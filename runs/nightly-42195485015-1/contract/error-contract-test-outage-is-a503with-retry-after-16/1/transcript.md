# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-f6da8a17-cef3-4c0a-a867-8d4e24dbd9c2` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-4f0d35a8-d5d7-47f4-a059-8921c8e47ead` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-b756fc67-e598-481b-a2a7-0ab38d4740a0` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-af5f953b-6132-4219-ad46-9ffcdcbe49df` |
| 5 | `GET /v1/admin/stats` | 503 | 20 | `qa-9307cc32-04a3-48c7-afc1-7420714d3f2e` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-6e4e4163-f81e-4b1c-8db0-965b710a647e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-87ca6622-97a4-494d-ac1e-27fdbda7bf7d` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-e5bc780d-3721-47f0-866b-0e3b3edd49f3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-b597245b-edd4-487e-8ef6-de0a3bd1f119` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-e9eb8b26-7b3d-4ee8-9394-a3cfd20ccc3b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f6da8a17-cef3-4c0a-a867-8d4e24dbd9c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6da8a17-cef3-4c0a-a867-8d4e24dbd9c2
Content-Type: application/json

--- request body ---
{"handle":"qa-25d60e715c1f","displayName":"QA 25d60e715c1f","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6da8a17-cef3-4c0a-a867-8d4e24dbd9c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 6
Location: /v1/accounts/qa-25d60e715c1f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c7bf781e-aee8-4467-85aa-e0a79d45f113","handle":"qa-25d60e715c1f","displayName":"QA 25d60e715c1f","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.646868532Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4f0d35a8-d5d7-47f4-a059-8921c8e47ead

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f0d35a8-d5d7-47f4-a059-8921c8e47ead
Content-Type: application/json

--- request body ---
{"handle":"qa-5f989f2790a9","displayName":"QA 5f989f2790a9","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f0d35a8-d5d7-47f4-a059-8921c8e47ead
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 6
Location: /v1/accounts/qa-5f989f2790a9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_75d83265-1296-41b3-9caa-375a3710ff35","handle":"qa-5f989f2790a9","displayName":"QA 5f989f2790a9","region":"eu","role":"user","createdAt":"2026-11-06T09:30:34.679875419Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b756fc67-e598-481b-a2a7-0ab38d4740a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b756fc67-e598-481b-a2a7-0ab38d4740a0
Content-Type: application/json

--- request body ---
{"handle":"qa-25d60e715c1f","password":"****"}

--- response: 200 in 27 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-b756fc67-e598-481b-a2a7-0ab38d4740a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c7bf781e-aee8-4467-85aa-e0a79d45f113"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-af5f953b-6132-4219-ad46-9ffcdcbe49df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af5f953b-6132-4219-ad46-9ffcdcbe49df
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5f989f2790a9","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-af5f953b-6132-4219-ad46-9ffcdcbe49df
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
Location: /v1/conversations/cnv_c5f864f8-2368-4cb7-8217-056b1bbf51bb
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c5f864f8-2368-4cb7-8217-056b1bbf51bb","subject":"Error contract","status":"open","region":"eu","participants":["qa-25d60e715c1f","qa-5f989f2790a9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:34.734664743Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-9307cc32-04a3-48c7-afc1-7420714d3f2e

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 07cb37cb-3232-4836-a541-3923924032c6
X-Correlation-Id: qa-9307cc32-04a3-48c7-afc1-7420714d3f2e
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9307cc32-04a3-48c7-afc1-7420714d3f2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-9307cc32-04a3-48c7-afc1-7420714d3f2e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6e4e4163-f81e-4b1c-8db0-965b710a647e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e4e4163-f81e-4b1c-8db0-965b710a647e
Content-Type: application/json

--- request body ---
{"handle":"qa-5f989f2790a9","password":"****"}

--- response: 200 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e4e4163-f81e-4b1c-8db0-965b710a647e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_75d83265-1296-41b3-9caa-375a3710ff35"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-87ca6622-97a4-494d-ac1e-27fdbda7bf7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87ca6622-97a4-494d-ac1e-27fdbda7bf7d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-87ca6622-97a4-494d-ac1e-27fdbda7bf7d
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
correlation: qa-e5bc780d-3721-47f0-866b-0e3b3edd49f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5bc780d-3721-47f0-866b-0e3b3edd49f3
Content-Type: application/json

--- request body ---
{"handle":"qa-5f989f2790a9","password":"****"}

--- response: 401 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e5bc780d-3721-47f0-866b-0e3b3edd49f3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e5bc780d-3721-47f0-866b-0e3b3edd49f3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b597245b-edd4-487e-8ef6-de0a3bd1f119

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b597245b-edd4-487e-8ef6-de0a3bd1f119
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b597245b-edd4-487e-8ef6-de0a3bd1f119
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
correlation: qa-e9eb8b26-7b3d-4ee8-9394-a3cfd20ccc3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9eb8b26-7b3d-4ee8-9394-a3cfd20ccc3b
Content-Type: application/json

--- request body ---
{"handle":"qa-25d60e715c1f","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9eb8b26-7b3d-4ee8-9394-a3cfd20ccc3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 295
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e9eb8b26-7b3d-4ee8-9394-a3cfd20ccc3b"}
```
