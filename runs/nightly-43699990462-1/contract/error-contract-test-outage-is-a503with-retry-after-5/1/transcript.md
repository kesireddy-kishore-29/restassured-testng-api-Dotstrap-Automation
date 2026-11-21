# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/accounts/{handle}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[5]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-99eb2d20-b44f-4b64-b99e-261ba20fd128` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-b163ea9a-0351-4332-8747-af5f8dc5c1c4` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-d34540b4-1f9d-442d-bad4-63af6b3fee0f` |
| 4 | `POST /v1/conversations` | 201 | 25 | `qa-c20053d4-3888-4a64-8d5c-468dac0b2c72` |
| 5 | `GET /v1/accounts/{handle}` | 503 | 7 | `qa-5994fbc0-aef1-48ec-9ba5-8d5f6d85b3e2` |
| 6 | `POST /v1/auth/token` | 200 | 6 | `qa-27be49bb-2b3c-4021-8dfa-2962185a00f6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-6c2b4e07-ced1-4e2d-a993-f1c8e10422d6` |
| 8 | `POST /v1/auth/token` | 401 | 32 | `qa-43ac2074-8978-46ae-9de0-8015ffd9b586` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-b4fff15b-eed2-4599-bbc6-948ddd7fb48b` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-8bd25f51-11b5-4677-86c9-aad656e8200e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-99eb2d20-b44f-4b64-b99e-261ba20fd128

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99eb2d20-b44f-4b64-b99e-261ba20fd128
Content-Type: application/json

--- request body ---
{"handle":"qa-f5ac11d5e313","displayName":"QA f5ac11d5e313","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-99eb2d20-b44f-4b64-b99e-261ba20fd128
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Location: /v1/accounts/qa-f5ac11d5e313
X-Served-Region: eu
Content-Length: 181

{"id":"acc_220e1ed1-b1d3-48df-a060-245ec234318c","handle":"qa-f5ac11d5e313","displayName":"QA f5ac11d5e313","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.470849358Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-b163ea9a-0351-4332-8747-af5f8dc5c1c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b163ea9a-0351-4332-8747-af5f8dc5c1c4
Content-Type: application/json

--- request body ---
{"handle":"qa-3e6240899db5","displayName":"QA 3e6240899db5","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-b163ea9a-0351-4332-8747-af5f8dc5c1c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 8
Location: /v1/accounts/qa-3e6240899db5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2bf58f9a-5723-414c-b253-5db1ad402d51","handle":"qa-3e6240899db5","displayName":"QA 3e6240899db5","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.508021735Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d34540b4-1f9d-442d-bad4-63af6b3fee0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d34540b4-1f9d-442d-bad4-63af6b3fee0f
Content-Type: application/json

--- request body ---
{"handle":"qa-f5ac11d5e313","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-d34540b4-1f9d-442d-bad4-63af6b3fee0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 452
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_220e1ed1-b1d3-48df-a060-245ec234318c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c20053d4-3888-4a64-8d5c-468dac0b2c72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c20053d4-3888-4a64-8d5c-468dac0b2c72
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3e6240899db5","subject":"Error contract","message":"Hi"}

--- response: 201 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-c20053d4-3888-4a64-8d5c-468dac0b2c72
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
Location: /v1/conversations/cnv_b39e9d7f-2ef6-44b1-94e8-383188127aec
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b39e9d7f-2ef6-44b1-94e8-383188127aec","subject":"Error contract","status":"open","region":"eu","participants":["qa-f5ac11d5e313","qa-3e6240899db5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.571652007Z"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-f5ac11d5e313
correlation: qa-5994fbc0-aef1-48ec-9ba5-8d5f6d85b3e2

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 377aca15-16cb-4e80-ab26-4709eb746eb5
X-Correlation-Id: qa-5994fbc0-aef1-48ec-9ba5-8d5f6d85b3e2
Content-Type: application/json

--- response: 503 in 7 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5994fbc0-aef1-48ec-9ba5-8d5f6d85b3e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 272

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/qa-f5ac11d5e313","correlationId":"qa-5994fbc0-aef1-48ec-9ba5-8d5f6d85b3e2"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-27be49bb-2b3c-4021-8dfa-2962185a00f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27be49bb-2b3c-4021-8dfa-2962185a00f6
Content-Type: application/json

--- request body ---
{"handle":"qa-3e6240899db5","password":"****"}

--- response: 200 in 6 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-27be49bb-2b3c-4021-8dfa-2962185a00f6
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2bf58f9a-5723-414c-b253-5db1ad402d51"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6c2b4e07-ced1-4e2d-a993-f1c8e10422d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c2b4e07-ced1-4e2d-a993-f1c8e10422d6
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6c2b4e07-ced1-4e2d-a993-f1c8e10422d6
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
correlation: qa-43ac2074-8978-46ae-9de0-8015ffd9b586

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43ac2074-8978-46ae-9de0-8015ffd9b586
Content-Type: application/json

--- request body ---
{"handle":"qa-3e6240899db5","password":"****"}

--- response: 401 in 32 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43ac2074-8978-46ae-9de0-8015ffd9b586
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-43ac2074-8978-46ae-9de0-8015ffd9b586"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b4fff15b-eed2-4599-bbc6-948ddd7fb48b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4fff15b-eed2-4599-bbc6-948ddd7fb48b
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b4fff15b-eed2-4599-bbc6-948ddd7fb48b
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
correlation: qa-8bd25f51-11b5-4677-86c9-aad656e8200e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bd25f51-11b5-4677-86c9-aad656e8200e
Content-Type: application/json

--- request body ---
{"handle":"qa-f5ac11d5e313","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8bd25f51-11b5-4677-86c9-aad656e8200e
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8bd25f51-11b5-4677-86c9-aad656e8200e"}
```
