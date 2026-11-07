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
| 1 | `POST /v1/accounts` | 201 | 21 | `qa-5db4de88-be7b-4e6f-a2a6-5758b97d8bf8` |
| 2 | `POST /v1/accounts` | 201 | 32 | `qa-c802878c-95d4-4026-ab60-136449782e3b` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-c82727fb-ac5c-48c0-95f7-8f9b23804527` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-456d9a7d-a75a-473d-834f-c556bf66f83c` |
| 5 | `GET /v1/admin/stats` | 503 | 24 | `qa-3dc99362-ed12-4d04-8678-026aaf7e1928` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-0af4fb74-0eaa-4e26-8035-90952145f64e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-c17cfb48-9b9d-4de7-b3c7-dd11d432cbaa` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-315c7a7a-bb48-4d66-9fe8-37a1c35e5d79` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-c9c64ac4-f9f7-43a3-9b45-36f4c6586dbd` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-27d0a8ee-bd25-4e17-90e0-bd72589fa4e1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5db4de88-be7b-4e6f-a2a6-5758b97d8bf8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5db4de88-be7b-4e6f-a2a6-5758b97d8bf8
Content-Type: application/json

--- request body ---
{"handle":"qa-8edd3a1bc301","displayName":"QA 8edd3a1bc301","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-5db4de88-be7b-4e6f-a2a6-5758b97d8bf8
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
Location: /v1/accounts/qa-8edd3a1bc301
X-Served-Region: eu
Content-Length: 181

{"id":"acc_78bb90a2-09fc-4cbf-a348-f25b762a831d","handle":"qa-8edd3a1bc301","displayName":"QA 8edd3a1bc301","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.931312185Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c802878c-95d4-4026-ab60-136449782e3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c802878c-95d4-4026-ab60-136449782e3b
Content-Type: application/json

--- request body ---
{"handle":"qa-d0d1a9c6c00a","displayName":"QA d0d1a9c6c00a","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-c802878c-95d4-4026-ab60-136449782e3b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 7
Location: /v1/accounts/qa-d0d1a9c6c00a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_47d8b1a8-168f-4efd-9fa8-70c7e02b3374","handle":"qa-d0d1a9c6c00a","displayName":"QA d0d1a9c6c00a","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.966353655Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c82727fb-ac5c-48c0-95f7-8f9b23804527

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c82727fb-ac5c-48c0-95f7-8f9b23804527
Content-Type: application/json

--- request body ---
{"handle":"qa-8edd3a1bc301","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-c82727fb-ac5c-48c0-95f7-8f9b23804527
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 330
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_78bb90a2-09fc-4cbf-a348-f25b762a831d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-456d9a7d-a75a-473d-834f-c556bf66f83c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-456d9a7d-a75a-473d-834f-c556bf66f83c
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d0d1a9c6c00a","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-456d9a7d-a75a-473d-834f-c556bf66f83c
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
Location: /v1/conversations/cnv_d7fcff8b-aefa-4158-84c4-ff2745e80ce7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d7fcff8b-aefa-4158-84c4-ff2745e80ce7","subject":"Error contract","status":"open","region":"eu","participants":["qa-8edd3a1bc301","qa-d0d1a9c6c00a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:24.040580003Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-3dc99362-ed12-4d04-8678-026aaf7e1928

--- request headers ---
Accept: application/json
X-Fault-Key: 88f06592-ca00-4edb-b4f4-f46373516e12
X-Fault: unavailable-once
X-Correlation-Id: qa-3dc99362-ed12-4d04-8678-026aaf7e1928
Content-Type: application/json

--- response: 503 in 24 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3dc99362-ed12-4d04-8678-026aaf7e1928
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-3dc99362-ed12-4d04-8678-026aaf7e1928"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0af4fb74-0eaa-4e26-8035-90952145f64e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0af4fb74-0eaa-4e26-8035-90952145f64e
Content-Type: application/json

--- request body ---
{"handle":"qa-d0d1a9c6c00a","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-0af4fb74-0eaa-4e26-8035-90952145f64e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_47d8b1a8-168f-4efd-9fa8-70c7e02b3374"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c17cfb48-9b9d-4de7-b3c7-dd11d432cbaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c17cfb48-9b9d-4de7-b3c7-dd11d432cbaa
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c17cfb48-9b9d-4de7-b3c7-dd11d432cbaa
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
correlation: qa-315c7a7a-bb48-4d66-9fe8-37a1c35e5d79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-315c7a7a-bb48-4d66-9fe8-37a1c35e5d79
Content-Type: application/json

--- request body ---
{"handle":"qa-d0d1a9c6c00a","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-315c7a7a-bb48-4d66-9fe8-37a1c35e5d79
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-315c7a7a-bb48-4d66-9fe8-37a1c35e5d79"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c9c64ac4-f9f7-43a3-9b45-36f4c6586dbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9c64ac4-f9f7-43a3-9b45-36f4c6586dbd
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c9c64ac4-f9f7-43a3-9b45-36f4c6586dbd
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
correlation: qa-27d0a8ee-bd25-4e17-90e0-bd72589fa4e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27d0a8ee-bd25-4e17-90e0-bd72589fa4e1
Content-Type: application/json

--- request body ---
{"handle":"qa-8edd3a1bc301","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27d0a8ee-bd25-4e17-90e0-bd72589fa4e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 318
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-27d0a8ee-bd25-4e17-90e0-bd72589fa4e1"}
```
