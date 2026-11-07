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
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-c363c4d7-fcbe-4fc4-9bb2-f92f28e846fc` |
| 2 | `POST /v1/accounts` | 201 | 81 | `qa-3a0380b1-27bf-48fb-a5da-5d869593e917` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-0fcde0c3-8fce-44a1-9b29-7e6091dea822` |
| 4 | `POST /v1/conversations` | 201 | 17 | `qa-d883d531-c19a-42b3-9f1b-b647eb3b39a8` |
| 5 | `GET /v1/admin/stats` | 503 | 13 | `qa-8a9c607f-8852-475a-a180-8c0ff9e56fc8` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-9568bf60-0496-4927-95f2-b9bfeae4ea2e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-1b776eb7-186d-4dd5-8a10-e054dfa52fe8` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-57b5885c-8450-42c2-9deb-fa7677473a7e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-64ee7474-cebe-4f62-8b81-fe781732c22f` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-e6d44994-d0ab-42d0-a1a7-4a77afaf4ec0` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c363c4d7-fcbe-4fc4-9bb2-f92f28e846fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c363c4d7-fcbe-4fc4-9bb2-f92f28e846fc
Content-Type: application/json

--- request body ---
{"handle":"qa-439a8ccd2c40","displayName":"QA 439a8ccd2c40","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-c363c4d7-fcbe-4fc4-9bb2-f92f28e846fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 6
Location: /v1/accounts/qa-439a8ccd2c40
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7d78cac7-b844-4085-8dc3-397f6e704b33","handle":"qa-439a8ccd2c40","displayName":"QA 439a8ccd2c40","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.664349719Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3a0380b1-27bf-48fb-a5da-5d869593e917

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a0380b1-27bf-48fb-a5da-5d869593e917
Content-Type: application/json

--- request body ---
{"handle":"qa-f9606946385e","displayName":"QA f9606946385e","password":"****","region":"eu"}

--- response: 201 in 81 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a0380b1-27bf-48fb-a5da-5d869593e917
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 6
Location: /v1/accounts/qa-f9606946385e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6aa27cca-98f4-429a-bb85-7327b5d96ca1","handle":"qa-f9606946385e","displayName":"QA f9606946385e","region":"eu","role":"user","createdAt":"2026-10-31T08:31:36.736517325Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0fcde0c3-8fce-44a1-9b29-7e6091dea822

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0fcde0c3-8fce-44a1-9b29-7e6091dea822
Content-Type: application/json

--- request body ---
{"handle":"qa-439a8ccd2c40","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-0fcde0c3-8fce-44a1-9b29-7e6091dea822
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 328
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7d78cac7-b844-4085-8dc3-397f6e704b33"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d883d531-c19a-42b3-9f1b-b647eb3b39a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d883d531-c19a-42b3-9f1b-b647eb3b39a8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f9606946385e","subject":"Error contract","message":"Hi"}

--- response: 201 in 17 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d883d531-c19a-42b3-9f1b-b647eb3b39a8
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
Location: /v1/conversations/cnv_f1681e3f-ebce-4218-a50a-29be58c4ee1f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f1681e3f-ebce-4218-a50a-29be58c4ee1f","subject":"Error contract","status":"open","region":"eu","participants":["qa-439a8ccd2c40","qa-f9606946385e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:36.827619188Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-8a9c607f-8852-475a-a180-8c0ff9e56fc8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 1a860164-d056-4ceb-a6c1-a0c454e54d58
X-Correlation-Id: qa-8a9c607f-8852-475a-a180-8c0ff9e56fc8
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8a9c607f-8852-475a-a180-8c0ff9e56fc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-8a9c607f-8852-475a-a180-8c0ff9e56fc8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-9568bf60-0496-4927-95f2-b9bfeae4ea2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9568bf60-0496-4927-95f2-b9bfeae4ea2e
Content-Type: application/json

--- request body ---
{"handle":"qa-f9606946385e","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9568bf60-0496-4927-95f2-b9bfeae4ea2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 323
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6aa27cca-98f4-429a-bb85-7327b5d96ca1"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1b776eb7-186d-4dd5-8a10-e054dfa52fe8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b776eb7-186d-4dd5-8a10-e054dfa52fe8
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1b776eb7-186d-4dd5-8a10-e054dfa52fe8
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
correlation: qa-57b5885c-8450-42c2-9deb-fa7677473a7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57b5885c-8450-42c2-9deb-fa7677473a7e
Content-Type: application/json

--- request body ---
{"handle":"qa-f9606946385e","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-57b5885c-8450-42c2-9deb-fa7677473a7e
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-57b5885c-8450-42c2-9deb-fa7677473a7e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-64ee7474-cebe-4f62-8b81-fe781732c22f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64ee7474-cebe-4f62-8b81-fe781732c22f
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-64ee7474-cebe-4f62-8b81-fe781732c22f
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
correlation: qa-e6d44994-d0ab-42d0-a1a7-4a77afaf4ec0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6d44994-d0ab-42d0-a1a7-4a77afaf4ec0
Content-Type: application/json

--- request body ---
{"handle":"qa-439a8ccd2c40","password":"****"}

--- response: 401 in 10 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e6d44994-d0ab-42d0-a1a7-4a77afaf4ec0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e6d44994-d0ab-42d0-a1a7-4a77afaf4ec0"}
```
