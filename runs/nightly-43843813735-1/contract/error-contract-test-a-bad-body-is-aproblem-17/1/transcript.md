# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/credits/purchases, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[17]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-9c1bd96e-c8a9-4549-8605-9a36ccc253f5` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-3a5a6cd2-63a5-4d65-874c-9a099d10730f` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-a86d113b-151d-4b89-a4ca-21b077cf85f4` |
| 4 | `POST /v1/conversations` | 201 | 6 | `qa-66587914-b713-4da4-96ac-e895694ad66f` |
| 5 | `POST /v1/credits/purchases` | 422 | 14 | `qa-128f2df5-de75-4508-8a1e-637dcee385a9` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-1f3eec01-2b66-4adc-8d5e-5bec021eb02a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-e5c5b18b-9ea8-42a9-8616-bbc62f2c502c` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-c982e015-157d-4b2d-841e-9fead54f0db1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-4052cfa5-76c3-44ed-8744-58984f2c33ab` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-132a7170-31c3-4eb0-a469-c1f974b1a101` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9c1bd96e-c8a9-4549-8605-9a36ccc253f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c1bd96e-c8a9-4549-8605-9a36ccc253f5
Content-Type: application/json

--- request body ---
{"handle":"qa-ac4905a17a54","displayName":"QA ac4905a17a54","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c1bd96e-c8a9-4549-8605-9a36ccc253f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 311
RateLimit-Reset: 7
Location: /v1/accounts/qa-ac4905a17a54
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b000d7e6-d365-47ee-8886-be4aa1d80b6a","handle":"qa-ac4905a17a54","displayName":"QA ac4905a17a54","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.507759425Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3a5a6cd2-63a5-4d65-874c-9a099d10730f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a5a6cd2-63a5-4d65-874c-9a099d10730f
Content-Type: application/json

--- request body ---
{"handle":"qa-5addffbf7f24","displayName":"QA 5addffbf7f24","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a5a6cd2-63a5-4d65-874c-9a099d10730f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 7
Location: /v1/accounts/qa-5addffbf7f24
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0865bfa7-c5ea-44b3-a375-5e2f697cf4d2","handle":"qa-5addffbf7f24","displayName":"QA 5addffbf7f24","region":"eu","role":"user","createdAt":"2026-11-16T09:53:54.530535176Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a86d113b-151d-4b89-a4ca-21b077cf85f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a86d113b-151d-4b89-a4ca-21b077cf85f4
Content-Type: application/json

--- request body ---
{"handle":"qa-ac4905a17a54","password":"****"}

--- response: 200 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-a86d113b-151d-4b89-a4ca-21b077cf85f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b000d7e6-d365-47ee-8886-be4aa1d80b6a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-66587914-b713-4da4-96ac-e895694ad66f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66587914-b713-4da4-96ac-e895694ad66f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5addffbf7f24","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-66587914-b713-4da4-96ac-e895694ad66f
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
Location: /v1/conversations/cnv_dcc58023-31f1-480e-a793-33490d36628e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_dcc58023-31f1-480e-a793-33490d36628e","subject":"Error contract","status":"open","region":"eu","participants":["qa-ac4905a17a54","qa-5addffbf7f24"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:54.568351010Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-128f2df5-de75-4508-8a1e-637dcee385a9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-9e05f24041d449d1ba4a185ada6daf44
X-Correlation-Id: qa-128f2df5-de75-4508-8a1e-637dcee385a9
Content-Type: application/json

--- request body ---
{"packId":"pack-0"}

--- response: 422 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-128f2df5-de75-4508-8a1e-637dcee385a9
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-128f2df5-de75-4508-8a1e-637dcee385a9","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1f3eec01-2b66-4adc-8d5e-5bec021eb02a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f3eec01-2b66-4adc-8d5e-5bec021eb02a
Content-Type: application/json

--- request body ---
{"handle":"qa-5addffbf7f24","password":"****"}

--- response: 200 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f3eec01-2b66-4adc-8d5e-5bec021eb02a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 297
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0865bfa7-c5ea-44b3-a375-5e2f697cf4d2"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e5c5b18b-9ea8-42a9-8616-bbc62f2c502c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5c5b18b-9ea8-42a9-8616-bbc62f2c502c
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e5c5b18b-9ea8-42a9-8616-bbc62f2c502c
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
correlation: qa-c982e015-157d-4b2d-841e-9fead54f0db1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c982e015-157d-4b2d-841e-9fead54f0db1
Content-Type: application/json

--- request body ---
{"handle":"qa-5addffbf7f24","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c982e015-157d-4b2d-841e-9fead54f0db1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c982e015-157d-4b2d-841e-9fead54f0db1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4052cfa5-76c3-44ed-8744-58984f2c33ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4052cfa5-76c3-44ed-8744-58984f2c33ab
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4052cfa5-76c3-44ed-8744-58984f2c33ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-132a7170-31c3-4eb0-a469-c1f974b1a101

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-132a7170-31c3-4eb0-a469-c1f974b1a101
Content-Type: application/json

--- request body ---
{"handle":"qa-ac4905a17a54","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-132a7170-31c3-4eb0-a469-c1f974b1a101
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-132a7170-31c3-4eb0-a469-c1f974b1a101"}
```
