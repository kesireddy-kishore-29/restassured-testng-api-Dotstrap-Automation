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
| 1 | `POST /v1/accounts` | 201 | 51 | `qa-788a89ae-71d6-457f-958a-76ed37d1fc90` |
| 2 | `POST /v1/accounts` | 201 | 29 | `qa-2a110559-0855-43dc-a2a1-3d0ce8fa409f` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-dba8fd26-e8e6-4d4e-9b1c-6999d3baa9d1` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-ca6c26cb-6724-452a-8811-1b2c054a35d6` |
| 5 | `DELETE /v1/accounts/me` | 503 | 15 | `qa-b9a03820-99bc-470e-be43-352b7656f23b` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-19271e59-fb53-4984-a10c-79b242d5160d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-aaa132c8-67ee-452f-af31-f80b096f928c` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-580f52af-47ea-4b7a-9a02-213af0355798` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-85b85d8f-39ee-4a38-b8e5-59f07706ab3c` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-d01a1fe6-3369-4128-9d6d-dd7fafd87909` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-788a89ae-71d6-457f-958a-76ed37d1fc90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-788a89ae-71d6-457f-958a-76ed37d1fc90
Content-Type: application/json

--- request body ---
{"handle":"qa-8b346739ff04","displayName":"QA 8b346739ff04","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-788a89ae-71d6-457f-958a-76ed37d1fc90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Location: /v1/accounts/qa-8b346739ff04
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b94864dd-a0a8-4099-b3e2-1284e735243a","handle":"qa-8b346739ff04","displayName":"QA 8b346739ff04","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.586859418Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2a110559-0855-43dc-a2a1-3d0ce8fa409f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a110559-0855-43dc-a2a1-3d0ce8fa409f
Content-Type: application/json

--- request body ---
{"handle":"qa-c5ff5d31e715","displayName":"QA c5ff5d31e715","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a110559-0855-43dc-a2a1-3d0ce8fa409f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Location: /v1/accounts/qa-c5ff5d31e715
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7b4672ab-719c-4166-aeda-890a56ded755","handle":"qa-c5ff5d31e715","displayName":"QA c5ff5d31e715","region":"eu","role":"user","createdAt":"2026-10-25T07:40:25.636135930Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dba8fd26-e8e6-4d4e-9b1c-6999d3baa9d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dba8fd26-e8e6-4d4e-9b1c-6999d3baa9d1
Content-Type: application/json

--- request body ---
{"handle":"qa-8b346739ff04","password":"****"}

--- response: 200 in 24 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-dba8fd26-e8e6-4d4e-9b1c-6999d3baa9d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 458
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b94864dd-a0a8-4099-b3e2-1284e735243a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ca6c26cb-6724-452a-8811-1b2c054a35d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca6c26cb-6724-452a-8811-1b2c054a35d6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c5ff5d31e715","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca6c26cb-6724-452a-8811-1b2c054a35d6
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
Location: /v1/conversations/cnv_a96e794e-a9f0-4abe-83f1-f1abc3ff6ee8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a96e794e-a9f0-4abe-83f1-f1abc3ff6ee8","subject":"Error contract","status":"open","region":"eu","participants":["qa-8b346739ff04","qa-c5ff5d31e715"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:25.728363131Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b9a03820-99bc-470e-be43-352b7656f23b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: cb78ec23-bde9-45cd-823c-f1edb6d7010a
X-Correlation-Id: qa-b9a03820-99bc-470e-be43-352b7656f23b
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b9a03820-99bc-470e-be43-352b7656f23b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-b9a03820-99bc-470e-be43-352b7656f23b"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-19271e59-fb53-4984-a10c-79b242d5160d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19271e59-fb53-4984-a10c-79b242d5160d
Content-Type: application/json

--- request body ---
{"handle":"qa-c5ff5d31e715","password":"****"}

--- response: 200 in 29 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-19271e59-fb53-4984-a10c-79b242d5160d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7b4672ab-719c-4166-aeda-890a56ded755"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aaa132c8-67ee-452f-af31-f80b096f928c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aaa132c8-67ee-452f-af31-f80b096f928c
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aaa132c8-67ee-452f-af31-f80b096f928c
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
correlation: qa-580f52af-47ea-4b7a-9a02-213af0355798

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-580f52af-47ea-4b7a-9a02-213af0355798
Content-Type: application/json

--- request body ---
{"handle":"qa-c5ff5d31e715","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-580f52af-47ea-4b7a-9a02-213af0355798
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-580f52af-47ea-4b7a-9a02-213af0355798"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-85b85d8f-39ee-4a38-b8e5-59f07706ab3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85b85d8f-39ee-4a38-b8e5-59f07706ab3c
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:25 GMT
Content-Type: text/plain
X-Correlation-Id: qa-85b85d8f-39ee-4a38-b8e5-59f07706ab3c
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
correlation: qa-d01a1fe6-3369-4128-9d6d-dd7fafd87909

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d01a1fe6-3369-4128-9d6d-dd7fafd87909
Content-Type: application/json

--- request body ---
{"handle":"qa-8b346739ff04","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d01a1fe6-3369-4128-9d6d-dd7fafd87909
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 429
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d01a1fe6-3369-4128-9d6d-dd7fafd87909"}
```
