# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[6]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-7bcdbb74-5f3c-431f-832f-df0b2eeb1fd5` |
| 2 | `POST /v1/accounts` | 201 | 66 | `qa-03652473-954a-4028-ab68-9b18029e886f` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-4644109c-9cb8-4d21-aaf0-6034cc0e39e7` |
| 4 | `POST /v1/conversations` | 201 | 42 | `qa-bec786f5-b827-4c28-a104-fa11154fef2e` |
| 5 | `POST /v1/conversations` | 503 | 22 | `qa-ed99e25d-e061-4ee1-8043-47555b296aea` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-7d61a383-b7ac-41b8-b00c-4741f0223c81` |
| 7 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-0a94b05e-62fc-4ee0-a196-5cecb379061c` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-2b81dd9b-39c7-4372-b41e-b83e86b5aaae` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-3270cdd9-2023-42bb-8cd3-53d884c6b27d` |
| 10 | `POST /v1/auth/token` | 401 | 49 | `qa-a6deb877-14d0-4cee-a5d3-3300400def1c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7bcdbb74-5f3c-431f-832f-df0b2eeb1fd5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bcdbb74-5f3c-431f-832f-df0b2eeb1fd5
Content-Type: application/json

--- request body ---
{"handle":"qa-46e3dccb6f7d","displayName":"QA 46e3dccb6f7d","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-7bcdbb74-5f3c-431f-832f-df0b2eeb1fd5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Location: /v1/accounts/qa-46e3dccb6f7d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_abe50e94-3a15-4a3a-99ee-32235267147c","handle":"qa-46e3dccb6f7d","displayName":"QA 46e3dccb6f7d","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.015059970Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-03652473-954a-4028-ab68-9b18029e886f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03652473-954a-4028-ab68-9b18029e886f
Content-Type: application/json

--- request body ---
{"handle":"qa-a02c81c0365b","displayName":"QA a02c81c0365b","password":"****","region":"eu"}

--- response: 201 in 66 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-03652473-954a-4028-ab68-9b18029e886f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Location: /v1/accounts/qa-a02c81c0365b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_761a87a8-9be6-4bda-8354-eb2da1ecee49","handle":"qa-a02c81c0365b","displayName":"QA a02c81c0365b","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.136384012Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-4644109c-9cb8-4d21-aaf0-6034cc0e39e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4644109c-9cb8-4d21-aaf0-6034cc0e39e7
Content-Type: application/json

--- request body ---
{"handle":"qa-46e3dccb6f7d","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-4644109c-9cb8-4d21-aaf0-6034cc0e39e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_abe50e94-3a15-4a3a-99ee-32235267147c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bec786f5-b827-4c28-a104-fa11154fef2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bec786f5-b827-4c28-a104-fa11154fef2e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a02c81c0365b","subject":"Error contract","message":"Hi"}

--- response: 201 in 42 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-bec786f5-b827-4c28-a104-fa11154fef2e
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
Location: /v1/conversations/cnv_a2418ab7-5ef6-4154-9513-bd31ac82c191
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a2418ab7-5ef6-4154-9513-bd31ac82c191","subject":"Error contract","status":"open","region":"eu","participants":["qa-46e3dccb6f7d","qa-a02c81c0365b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.272131485Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-ed99e25d-e061-4ee1-8043-47555b296aea

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 4d7413ba-72a2-4756-803b-fba52f1bd3fd
X-Correlation-Id: qa-ed99e25d-e061-4ee1-8043-47555b296aea
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-46e3dccb6f7d","subject":"Probe","message":"Hi"}

--- response: 503 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ed99e25d-e061-4ee1-8043-47555b296aea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-ed99e25d-e061-4ee1-8043-47555b296aea"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7d61a383-b7ac-41b8-b00c-4741f0223c81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d61a383-b7ac-41b8-b00c-4741f0223c81
Content-Type: application/json

--- request body ---
{"handle":"qa-a02c81c0365b","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d61a383-b7ac-41b8-b00c-4741f0223c81
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_761a87a8-9be6-4bda-8354-eb2da1ecee49"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0a94b05e-62fc-4ee0-a196-5cecb379061c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a94b05e-62fc-4ee0-a196-5cecb379061c
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0a94b05e-62fc-4ee0-a196-5cecb379061c
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
correlation: qa-2b81dd9b-39c7-4372-b41e-b83e86b5aaae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b81dd9b-39c7-4372-b41e-b83e86b5aaae
Content-Type: application/json

--- request body ---
{"handle":"qa-a02c81c0365b","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b81dd9b-39c7-4372-b41e-b83e86b5aaae
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2b81dd9b-39c7-4372-b41e-b83e86b5aaae"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3270cdd9-2023-42bb-8cd3-53d884c6b27d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3270cdd9-2023-42bb-8cd3-53d884c6b27d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3270cdd9-2023-42bb-8cd3-53d884c6b27d
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
correlation: qa-a6deb877-14d0-4cee-a5d3-3300400def1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6deb877-14d0-4cee-a5d3-3300400def1c
Content-Type: application/json

--- request body ---
{"handle":"qa-46e3dccb6f7d","password":"****"}

--- response: 401 in 49 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a6deb877-14d0-4cee-a5d3-3300400def1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 432
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a6deb877-14d0-4cee-a5d3-3300400def1c"}
```
