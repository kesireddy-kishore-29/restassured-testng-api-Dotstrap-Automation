# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-7611cc50-2190-484d-b1ef-06e04a584bc4` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-96d0e98c-00a6-4f67-a3a5-de35e880f318` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-657957d3-3e99-42d3-b072-a185a6811f7d` |
| 4 | `POST /v1/conversations` | 201 | 32 | `qa-c535390e-d995-4bd4-acf6-a7e41941ab3b` |
| 5 | `GET /v1/conversations` | 503 | 36 | `qa-3eaa81d7-7a69-4f54-b894-d768c0777a17` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-39ff9948-2fa6-4811-9d2f-6dca36365d67` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-15e99abf-163b-4fca-bde6-2500c61077b9` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-3df44d0d-230c-4bd0-84b4-3f8f962d81da` |
| 9 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-fd6e1d42-a9f5-4e4f-ae42-c6e5fcb8e726` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-452c63f0-8a9f-4d9a-9045-7bd14ae201f5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7611cc50-2190-484d-b1ef-06e04a584bc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7611cc50-2190-484d-b1ef-06e04a584bc4
Content-Type: application/json

--- request body ---
{"handle":"qa-055abd9e474f","displayName":"QA 055abd9e474f","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-7611cc50-2190-484d-b1ef-06e04a584bc4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Location: /v1/accounts/qa-055abd9e474f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5ee54e0d-ec6a-4d50-9935-092d1d2b2227","handle":"qa-055abd9e474f","displayName":"QA 055abd9e474f","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.573837156Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-96d0e98c-00a6-4f67-a3a5-de35e880f318

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96d0e98c-00a6-4f67-a3a5-de35e880f318
Content-Type: application/json

--- request body ---
{"handle":"qa-6f057cd891a6","displayName":"QA 6f057cd891a6","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-96d0e98c-00a6-4f67-a3a5-de35e880f318
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Location: /v1/accounts/qa-6f057cd891a6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a76e8cec-9a3d-48a5-9df8-0501027d0a2d","handle":"qa-6f057cd891a6","displayName":"QA 6f057cd891a6","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.617288635Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-657957d3-3e99-42d3-b072-a185a6811f7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-657957d3-3e99-42d3-b072-a185a6811f7d
Content-Type: application/json

--- request body ---
{"handle":"qa-055abd9e474f","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-657957d3-3e99-42d3-b072-a185a6811f7d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5ee54e0d-ec6a-4d50-9935-092d1d2b2227"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c535390e-d995-4bd4-acf6-a7e41941ab3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c535390e-d995-4bd4-acf6-a7e41941ab3b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6f057cd891a6","subject":"Error contract","message":"Hi"}

--- response: 201 in 32 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-c535390e-d995-4bd4-acf6-a7e41941ab3b
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
Location: /v1/conversations/cnv_3ac96621-bbe4-42ec-8b13-260ed17b90ab
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3ac96621-bbe4-42ec-8b13-260ed17b90ab","subject":"Error contract","status":"open","region":"eu","participants":["qa-055abd9e474f","qa-6f057cd891a6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:14.695942366Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-3eaa81d7-7a69-4f54-b894-d768c0777a17

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 8deaf007-b00e-46fd-b718-183282843ec3
X-Correlation-Id: qa-3eaa81d7-7a69-4f54-b894-d768c0777a17
Content-Type: application/json

--- response: 503 in 36 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3eaa81d7-7a69-4f54-b894-d768c0777a17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-3eaa81d7-7a69-4f54-b894-d768c0777a17"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-39ff9948-2fa6-4811-9d2f-6dca36365d67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39ff9948-2fa6-4811-9d2f-6dca36365d67
Content-Type: application/json

--- request body ---
{"handle":"qa-6f057cd891a6","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-39ff9948-2fa6-4811-9d2f-6dca36365d67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a76e8cec-9a3d-48a5-9df8-0501027d0a2d"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-15e99abf-163b-4fca-bde6-2500c61077b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15e99abf-163b-4fca-bde6-2500c61077b9
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-15e99abf-163b-4fca-bde6-2500c61077b9
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
correlation: qa-3df44d0d-230c-4bd0-84b4-3f8f962d81da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3df44d0d-230c-4bd0-84b4-3f8f962d81da
Content-Type: application/json

--- request body ---
{"handle":"qa-6f057cd891a6","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3df44d0d-230c-4bd0-84b4-3f8f962d81da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3df44d0d-230c-4bd0-84b4-3f8f962d81da"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd6e1d42-a9f5-4e4f-ae42-c6e5fcb8e726

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd6e1d42-a9f5-4e4f-ae42-c6e5fcb8e726
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd6e1d42-a9f5-4e4f-ae42-c6e5fcb8e726
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
correlation: qa-452c63f0-8a9f-4d9a-9045-7bd14ae201f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-452c63f0-8a9f-4d9a-9045-7bd14ae201f5
Content-Type: application/json

--- request body ---
{"handle":"qa-055abd9e474f","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-452c63f0-8a9f-4d9a-9045-7bd14ae201f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 415
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-452c63f0-8a9f-4d9a-9045-7bd14ae201f5"}
```
