# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-142b7a0d-a833-48e9-8826-c4103fedd47f` |
| 2 | `POST /v1/accounts` | 201 | 61 | `qa-813e26f7-9771-4080-b912-3f9272b49819` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-0139eb8a-78f0-4091-a0af-e1287f0f721d` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-de5237b1-c399-4073-ad31-ff24f9309651` |
| 5 | `GET /v1/credits/balance` | 503 | 13 | `qa-176a3a8b-f6da-4e69-a12d-7795f5f652fb` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-e66d0c22-5332-4e20-a486-294cbb0d69fd` |
| 7 | `DELETE /v1/accounts/me` | 204 | 41 | `qa-2fd60ee9-1de0-442a-b1e4-da8c3f70fa21` |
| 8 | `POST /v1/auth/token` | 401 | 39 | `qa-37e63514-4217-4eda-a87c-166045816326` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-fd86c362-3cce-4a75-b441-965e20159aaf` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-e202e495-e409-45f4-a28d-cf4627d52ea2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-142b7a0d-a833-48e9-8826-c4103fedd47f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-142b7a0d-a833-48e9-8826-c4103fedd47f
Content-Type: application/json

--- request body ---
{"handle":"qa-adb66694ceb6","displayName":"QA adb66694ceb6","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-142b7a0d-a833-48e9-8826-c4103fedd47f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 370
RateLimit-Reset: 7
Location: /v1/accounts/qa-adb66694ceb6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_551cd556-432c-481a-afa1-742d704b3642","handle":"qa-adb66694ceb6","displayName":"QA adb66694ceb6","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.898319532Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-813e26f7-9771-4080-b912-3f9272b49819

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-813e26f7-9771-4080-b912-3f9272b49819
Content-Type: application/json

--- request body ---
{"handle":"qa-24a120deaa37","displayName":"QA 24a120deaa37","password":"****","region":"eu"}

--- response: 201 in 61 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-813e26f7-9771-4080-b912-3f9272b49819
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 365
RateLimit-Reset: 7
Location: /v1/accounts/qa-24a120deaa37
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5175ef99-0d99-4219-acf9-a4a2054c5dbb","handle":"qa-24a120deaa37","displayName":"QA 24a120deaa37","region":"eu","role":"user","createdAt":"2026-11-13T09:42:07.963164776Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0139eb8a-78f0-4091-a0af-e1287f0f721d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0139eb8a-78f0-4091-a0af-e1287f0f721d
Content-Type: application/json

--- request body ---
{"handle":"qa-adb66694ceb6","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-0139eb8a-78f0-4091-a0af-e1287f0f721d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_551cd556-432c-481a-afa1-742d704b3642"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-de5237b1-c399-4073-ad31-ff24f9309651

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de5237b1-c399-4073-ad31-ff24f9309651
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-24a120deaa37","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-de5237b1-c399-4073-ad31-ff24f9309651
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
Location: /v1/conversations/cnv_f7f3fb0e-c6e4-4077-a0d1-d2b627485f76
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f7f3fb0e-c6e4-4077-a0d1-d2b627485f76","subject":"Error contract","status":"open","region":"eu","participants":["qa-adb66694ceb6","qa-24a120deaa37"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:08.015866015Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-176a3a8b-f6da-4e69-a12d-7795f5f652fb

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: a2f7923e-42ee-41aa-a345-3c269abf54c3
X-Correlation-Id: qa-176a3a8b-f6da-4e69-a12d-7795f5f652fb
Content-Type: application/json

--- response: 503 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-176a3a8b-f6da-4e69-a12d-7795f5f652fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-176a3a8b-f6da-4e69-a12d-7795f5f652fb"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e66d0c22-5332-4e20-a486-294cbb0d69fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e66d0c22-5332-4e20-a486-294cbb0d69fd
Content-Type: application/json

--- request body ---
{"handle":"qa-24a120deaa37","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-e66d0c22-5332-4e20-a486-294cbb0d69fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5175ef99-0d99-4219-acf9-a4a2054c5dbb"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2fd60ee9-1de0-442a-b1e4-da8c3f70fa21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fd60ee9-1de0-442a-b1e4-da8c3f70fa21
Content-Type: application/json

--- response: 204 in 41 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2fd60ee9-1de0-442a-b1e4-da8c3f70fa21
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
correlation: qa-37e63514-4217-4eda-a87c-166045816326

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37e63514-4217-4eda-a87c-166045816326
Content-Type: application/json

--- request body ---
{"handle":"qa-24a120deaa37","password":"****"}

--- response: 401 in 39 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37e63514-4217-4eda-a87c-166045816326
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 333
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-37e63514-4217-4eda-a87c-166045816326"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fd86c362-3cce-4a75-b441-965e20159aaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd86c362-3cce-4a75-b441-965e20159aaf
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fd86c362-3cce-4a75-b441-965e20159aaf
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
correlation: qa-e202e495-e409-45f4-a28d-cf4627d52ea2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e202e495-e409-45f4-a28d-cf4627d52ea2
Content-Type: application/json

--- request body ---
{"handle":"qa-adb66694ceb6","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e202e495-e409-45f4-a28d-cf4627d52ea2
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e202e495-e409-45f4-a28d-cf4627d52ea2"}
```
