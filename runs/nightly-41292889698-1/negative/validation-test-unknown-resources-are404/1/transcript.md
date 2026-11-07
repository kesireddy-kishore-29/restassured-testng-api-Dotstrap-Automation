# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-1beb4926-8995-47ad-9cf1-59018ab40498` |
| 2 | `POST /v1/auth/token` | 200 | 9 | `qa-1debf941-ddce-4bc0-a647-63c2ad001cb3` |
| 3 | `GET /v1/conversations/{id}` | 404 | 9 | `qa-5b130c49-d6a4-4889-b135-ee3bc168a0b9` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 8 | `qa-d73a03a9-ea26-4a72-8c77-efe038c455aa` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-c6236201-4748-4221-967a-0aaa46ff11ec` |
| 6 | `POST /v1/auth/token` | 401 | 6 | `qa-88281778-ceeb-48d1-a9d0-1562dc917d3c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1beb4926-8995-47ad-9cf1-59018ab40498

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1beb4926-8995-47ad-9cf1-59018ab40498
Content-Type: application/json

--- request body ---
{"handle":"qa-b92a091ea784","displayName":"QA b92a091ea784","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-1beb4926-8995-47ad-9cf1-59018ab40498
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Location: /v1/accounts/qa-b92a091ea784
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9da02d3-addd-4613-a099-02ea3731e97e","handle":"qa-b92a091ea784","displayName":"QA b92a091ea784","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.875759395Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1debf941-ddce-4bc0-a647-63c2ad001cb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1debf941-ddce-4bc0-a647-63c2ad001cb3
Content-Type: application/json

--- request body ---
{"handle":"qa-b92a091ea784","password":"****"}

--- response: 200 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-1debf941-ddce-4bc0-a647-63c2ad001cb3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e9da02d3-addd-4613-a099-02ea3731e97e"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-5b130c49-d6a4-4889-b135-ee3bc168a0b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b130c49-d6a4-4889-b135-ee3bc168a0b9
Content-Type: application/json

--- response: 404 in 9 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b130c49-d6a4-4889-b135-ee3bc168a0b9
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-5b130c49-d6a4-4889-b135-ee3bc168a0b9"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-d73a03a9-ea26-4a72-8c77-efe038c455aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d73a03a9-ea26-4a72-8c77-efe038c455aa
Content-Type: application/json

--- response: 404 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d73a03a9-ea26-4a72-8c77-efe038c455aa
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-d73a03a9-ea26-4a72-8c77-efe038c455aa"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c6236201-4748-4221-967a-0aaa46ff11ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6236201-4748-4221-967a-0aaa46ff11ec
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c6236201-4748-4221-967a-0aaa46ff11ec
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-88281778-ceeb-48d1-a9d0-1562dc917d3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88281778-ceeb-48d1-a9d0-1562dc917d3c
Content-Type: application/json

--- request body ---
{"handle":"qa-b92a091ea784","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-88281778-ceeb-48d1-a9d0-1562dc917d3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-88281778-ceeb-48d1-a9d0-1562dc917d3c"}
```
