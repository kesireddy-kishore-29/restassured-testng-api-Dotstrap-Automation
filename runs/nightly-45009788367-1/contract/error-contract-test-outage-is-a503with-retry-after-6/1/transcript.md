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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-21f57053-8edc-4a9a-b66d-0b3570e33a2d` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-9699b2fd-c88b-4914-8eed-b61aa6c3da07` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-d4eaa34c-7122-4790-81c0-975d6df8911b` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-f0931873-3aeb-4a48-b2c0-cd9ad12bfe61` |
| 5 | `POST /v1/conversations` | 503 | 13 | `qa-849336b2-5504-4e57-907c-686dd2e53292` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-e9bfea92-0b9c-48f7-835b-3c584d724e0e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-e3b4e5c3-f454-45f8-9d11-4fb75b6b0652` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-af768479-1b32-44f2-9b71-ca762973d6fb` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-f729c93b-fa7e-4239-b392-6a82b78ef6ae` |
| 10 | `POST /v1/auth/token` | 401 | 26 | `qa-15357a51-c48f-42fe-9cbe-934a7d0c07e2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-21f57053-8edc-4a9a-b66d-0b3570e33a2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21f57053-8edc-4a9a-b66d-0b3570e33a2d
Content-Type: application/json

--- request body ---
{"handle":"qa-86c17aa736e1","displayName":"QA 86c17aa736e1","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-21f57053-8edc-4a9a-b66d-0b3570e33a2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 476
RateLimit-Reset: 9
Location: /v1/accounts/qa-86c17aa736e1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8976f983-c937-4a6f-a507-c121e4ec6368","handle":"qa-86c17aa736e1","displayName":"QA 86c17aa736e1","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.361568727Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9699b2fd-c88b-4914-8eed-b61aa6c3da07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9699b2fd-c88b-4914-8eed-b61aa6c3da07
Content-Type: application/json

--- request body ---
{"handle":"qa-7cbd924d62f6","displayName":"QA 7cbd924d62f6","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-9699b2fd-c88b-4914-8eed-b61aa6c3da07
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 9
Location: /v1/accounts/qa-7cbd924d62f6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ecf2f712-9d82-4db7-9395-189a27017672","handle":"qa-7cbd924d62f6","displayName":"QA 7cbd924d62f6","region":"eu","role":"user","createdAt":"2026-11-22T09:54:41.396976882Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d4eaa34c-7122-4790-81c0-975d6df8911b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d4eaa34c-7122-4790-81c0-975d6df8911b
Content-Type: application/json

--- request body ---
{"handle":"qa-86c17aa736e1","password":"****"}

--- response: 200 in 27 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-d4eaa34c-7122-4790-81c0-975d6df8911b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 455
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8976f983-c937-4a6f-a507-c121e4ec6368"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f0931873-3aeb-4a48-b2c0-cd9ad12bfe61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0931873-3aeb-4a48-b2c0-cd9ad12bfe61
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7cbd924d62f6","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-f0931873-3aeb-4a48-b2c0-cd9ad12bfe61
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
Location: /v1/conversations/cnv_632d4501-f569-4dad-aa47-fceb91512b75
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_632d4501-f569-4dad-aa47-fceb91512b75","subject":"Error contract","status":"open","region":"eu","participants":["qa-86c17aa736e1","qa-7cbd924d62f6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:41.498383273Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-849336b2-5504-4e57-907c-686dd2e53292

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 8a423390-a7f1-4af6-884e-72fdde917ff4
X-Correlation-Id: qa-849336b2-5504-4e57-907c-686dd2e53292
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-86c17aa736e1","subject":"Probe","message":"Hi"}

--- response: 503 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-849336b2-5504-4e57-907c-686dd2e53292
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-849336b2-5504-4e57-907c-686dd2e53292"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e9bfea92-0b9c-48f7-835b-3c584d724e0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9bfea92-0b9c-48f7-835b-3c584d724e0e
Content-Type: application/json

--- request body ---
{"handle":"qa-7cbd924d62f6","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9bfea92-0b9c-48f7-835b-3c584d724e0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ecf2f712-9d82-4db7-9395-189a27017672"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e3b4e5c3-f454-45f8-9d11-4fb75b6b0652

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3b4e5c3-f454-45f8-9d11-4fb75b6b0652
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e3b4e5c3-f454-45f8-9d11-4fb75b6b0652
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
correlation: qa-af768479-1b32-44f2-9b71-ca762973d6fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af768479-1b32-44f2-9b71-ca762973d6fb
Content-Type: application/json

--- request body ---
{"handle":"qa-7cbd924d62f6","password":"****"}

--- response: 401 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af768479-1b32-44f2-9b71-ca762973d6fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-af768479-1b32-44f2-9b71-ca762973d6fb"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f729c93b-fa7e-4239-b392-6a82b78ef6ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f729c93b-fa7e-4239-b392-6a82b78ef6ae
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f729c93b-fa7e-4239-b392-6a82b78ef6ae
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
correlation: qa-15357a51-c48f-42fe-9cbe-934a7d0c07e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15357a51-c48f-42fe-9cbe-934a7d0c07e2
Content-Type: application/json

--- request body ---
{"handle":"qa-86c17aa736e1","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-15357a51-c48f-42fe-9cbe-934a7d0c07e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 412
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-15357a51-c48f-42fe-9cbe-934a7d0c07e2"}
```
