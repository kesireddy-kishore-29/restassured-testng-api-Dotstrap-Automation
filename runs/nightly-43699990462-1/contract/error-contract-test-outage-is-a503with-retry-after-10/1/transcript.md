# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[10]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-420dcd40-713b-43c8-ab2d-d9ded0151b7a` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-a11d4fe2-85d4-4f21-96d0-cbe705e24ef3` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-0ecb244b-2465-4e29-97d1-eb356e3d851f` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-53312867-6fe7-48d3-9233-bdd2f541757b` |
| 5 | `POST /v1/conversations/{id}/messages` | 503 | 5 | `qa-c22e19f3-4727-4980-882d-cca06e9aa47c` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-33f481b6-14bf-4bad-8007-d7442b63fbf2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-d905c218-f2ac-4aa6-b730-b40ecdd5967e` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-0ea044c0-b8c1-4f27-a0ad-21b5eab95296` |
| 9 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-b280a34c-84ba-48c1-82a4-86cd3312f6dc` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-ddcf7d19-a13d-4d5f-94f5-040bbbb2cc28` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-420dcd40-713b-43c8-ab2d-d9ded0151b7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-420dcd40-713b-43c8-ab2d-d9ded0151b7a
Content-Type: application/json

--- request body ---
{"handle":"qa-acb830e6e705","displayName":"QA acb830e6e705","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-420dcd40-713b-43c8-ab2d-d9ded0151b7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 403
RateLimit-Reset: 8
Location: /v1/accounts/qa-acb830e6e705
X-Served-Region: eu
Content-Length: 181

{"id":"acc_85edf95d-a136-4c8a-9235-3072f44a58e3","handle":"qa-acb830e6e705","displayName":"QA acb830e6e705","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.921357431Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a11d4fe2-85d4-4f21-96d0-cbe705e24ef3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a11d4fe2-85d4-4f21-96d0-cbe705e24ef3
Content-Type: application/json

--- request body ---
{"handle":"qa-46079f1a5668","displayName":"QA 46079f1a5668","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-a11d4fe2-85d4-4f21-96d0-cbe705e24ef3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 8
Location: /v1/accounts/qa-46079f1a5668
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f97219bd-b215-46b7-bb4b-a921d07bfe2b","handle":"qa-46079f1a5668","displayName":"QA 46079f1a5668","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.962919577Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0ecb244b-2465-4e29-97d1-eb356e3d851f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ecb244b-2465-4e29-97d1-eb356e3d851f
Content-Type: application/json

--- request body ---
{"handle":"qa-acb830e6e705","password":"****"}

--- response: 200 in 15 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ecb244b-2465-4e29-97d1-eb356e3d851f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_85edf95d-a136-4c8a-9235-3072f44a58e3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-53312867-6fe7-48d3-9233-bdd2f541757b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53312867-6fe7-48d3-9233-bdd2f541757b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-46079f1a5668","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-53312867-6fe7-48d3-9233-bdd2f541757b
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
Location: /v1/conversations/cnv_b3e77051-fe7e-4c71-b4c2-6759d6f441d0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b3e77051-fe7e-4c71-b4c2-6759d6f441d0","subject":"Error contract","status":"open","region":"eu","participants":["qa-acb830e6e705","qa-46079f1a5668"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:10.007034820Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_b3e77051-fe7e-4c71-b4c2-6759d6f441d0/messages
correlation: qa-c22e19f3-4727-4980-882d-cca06e9aa47c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: e85ec07f-13da-4982-9385-dc9da0fa34b7
X-Correlation-Id: qa-c22e19f3-4727-4980-882d-cca06e9aa47c
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 503 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c22e19f3-4727-4980-882d-cca06e9aa47c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 311

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_b3e77051-fe7e-4c71-b4c2-6759d6f441d0/messages","correlationId":"qa-c22e19f3-4727-4980-882d-cca06e9aa47c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-33f481b6-14bf-4bad-8007-d7442b63fbf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33f481b6-14bf-4bad-8007-d7442b63fbf2
Content-Type: application/json

--- request body ---
{"handle":"qa-46079f1a5668","password":"****"}

--- response: 200 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-33f481b6-14bf-4bad-8007-d7442b63fbf2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f97219bd-b215-46b7-bb4b-a921d07bfe2b"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d905c218-f2ac-4aa6-b730-b40ecdd5967e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d905c218-f2ac-4aa6-b730-b40ecdd5967e
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d905c218-f2ac-4aa6-b730-b40ecdd5967e
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
correlation: qa-0ea044c0-b8c1-4f27-a0ad-21b5eab95296

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ea044c0-b8c1-4f27-a0ad-21b5eab95296
Content-Type: application/json

--- request body ---
{"handle":"qa-46079f1a5668","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0ea044c0-b8c1-4f27-a0ad-21b5eab95296
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 378
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0ea044c0-b8c1-4f27-a0ad-21b5eab95296"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b280a34c-84ba-48c1-82a4-86cd3312f6dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b280a34c-84ba-48c1-82a4-86cd3312f6dc
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b280a34c-84ba-48c1-82a4-86cd3312f6dc
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
correlation: qa-ddcf7d19-a13d-4d5f-94f5-040bbbb2cc28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddcf7d19-a13d-4d5f-94f5-040bbbb2cc28
Content-Type: application/json

--- request body ---
{"handle":"qa-acb830e6e705","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ddcf7d19-a13d-4d5f-94f5-040bbbb2cc28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ddcf7d19-a13d-4d5f-94f5-040bbbb2cc28"}
```
