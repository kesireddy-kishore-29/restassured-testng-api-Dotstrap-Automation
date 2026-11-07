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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-f03afc02-f6be-491e-80c6-b0a910451adb` |
| 2 | `POST /v1/accounts` | 201 | 10 | `qa-791c63e8-561e-41fa-95c4-e45babf7fc82` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-78fe9e05-9e5b-4ae4-91cd-131c8f0d79b3` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-e8361fe2-4692-4c9e-968b-938fa161c2e8` |
| 5 | `GET /v1/admin/stats` | 503 | 11 | `qa-ee62c2c0-8d3b-4bf4-aee9-534a37caad6d` |
| 6 | `POST /v1/auth/token` | 200 | 11 | `qa-acac7fe8-054b-43e5-b7f5-701c7301e37d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-5063fc05-7543-48fa-ad1b-029d51656526` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-bb606d74-abde-4b4e-a67f-ce4f35b399ee` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-12dc1c6e-20ca-4f5f-a67e-f8ae9dc387df` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-0ffbf5ba-6d34-44e5-80af-01c6c2dfaa52` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f03afc02-f6be-491e-80c6-b0a910451adb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f03afc02-f6be-491e-80c6-b0a910451adb
Content-Type: application/json

--- request body ---
{"handle":"qa-1f81314cf566","displayName":"QA 1f81314cf566","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f03afc02-f6be-491e-80c6-b0a910451adb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 8
Location: /v1/accounts/qa-1f81314cf566
X-Served-Region: eu
Content-Length: 181

{"id":"acc_457cd96a-e227-4dde-97e1-559b02813870","handle":"qa-1f81314cf566","displayName":"QA 1f81314cf566","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.543371024Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-791c63e8-561e-41fa-95c4-e45babf7fc82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-791c63e8-561e-41fa-95c4-e45babf7fc82
Content-Type: application/json

--- request body ---
{"handle":"qa-a0b6653402b2","displayName":"QA a0b6653402b2","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-791c63e8-561e-41fa-95c4-e45babf7fc82
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 8
Location: /v1/accounts/qa-a0b6653402b2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d4931d2e-acaa-4ed6-a45f-d4f8768422bd","handle":"qa-a0b6653402b2","displayName":"QA a0b6653402b2","region":"eu","role":"user","createdAt":"2026-11-02T09:38:37.567051271Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-78fe9e05-9e5b-4ae4-91cd-131c8f0d79b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78fe9e05-9e5b-4ae4-91cd-131c8f0d79b3
Content-Type: application/json

--- request body ---
{"handle":"qa-1f81314cf566","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-78fe9e05-9e5b-4ae4-91cd-131c8f0d79b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_457cd96a-e227-4dde-97e1-559b02813870"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e8361fe2-4692-4c9e-968b-938fa161c2e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8361fe2-4692-4c9e-968b-938fa161c2e8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a0b6653402b2","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8361fe2-4692-4c9e-968b-938fa161c2e8
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
Location: /v1/conversations/cnv_fb2c20c5-0d62-45da-8f1e-cbfd57d76958
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_fb2c20c5-0d62-45da-8f1e-cbfd57d76958","subject":"Error contract","status":"open","region":"eu","participants":["qa-1f81314cf566","qa-a0b6653402b2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:37.618245509Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-ee62c2c0-8d3b-4bf4-aee9-534a37caad6d

--- request headers ---
Accept: application/json
X-Fault-Key: fd91a26e-b55e-498b-85c7-6b5efe41951a
X-Fault: unavailable-once
X-Correlation-Id: qa-ee62c2c0-8d3b-4bf4-aee9-534a37caad6d
Content-Type: application/json

--- response: 503 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee62c2c0-8d3b-4bf4-aee9-534a37caad6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-ee62c2c0-8d3b-4bf4-aee9-534a37caad6d"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-acac7fe8-054b-43e5-b7f5-701c7301e37d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-acac7fe8-054b-43e5-b7f5-701c7301e37d
Content-Type: application/json

--- request body ---
{"handle":"qa-a0b6653402b2","password":"****"}

--- response: 200 in 11 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-acac7fe8-054b-43e5-b7f5-701c7301e37d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 325
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d4931d2e-acaa-4ed6-a45f-d4f8768422bd"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5063fc05-7543-48fa-ad1b-029d51656526

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5063fc05-7543-48fa-ad1b-029d51656526
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5063fc05-7543-48fa-ad1b-029d51656526
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
correlation: qa-bb606d74-abde-4b4e-a67f-ce4f35b399ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb606d74-abde-4b4e-a67f-ce4f35b399ee
Content-Type: application/json

--- request body ---
{"handle":"qa-a0b6653402b2","password":"****"}

--- response: 401 in 15 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bb606d74-abde-4b4e-a67f-ce4f35b399ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bb606d74-abde-4b4e-a67f-ce4f35b399ee"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-12dc1c6e-20ca-4f5f-a67e-f8ae9dc387df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12dc1c6e-20ca-4f5f-a67e-f8ae9dc387df
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-12dc1c6e-20ca-4f5f-a67e-f8ae9dc387df
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
correlation: qa-0ffbf5ba-6d34-44e5-80af-01c6c2dfaa52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ffbf5ba-6d34-44e5-80af-01c6c2dfaa52
Content-Type: application/json

--- request body ---
{"handle":"qa-1f81314cf566","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ffbf5ba-6d34-44e5-80af-01c6c2dfaa52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 319
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0ffbf5ba-6d34-44e5-80af-01c6c2dfaa52"}
```
