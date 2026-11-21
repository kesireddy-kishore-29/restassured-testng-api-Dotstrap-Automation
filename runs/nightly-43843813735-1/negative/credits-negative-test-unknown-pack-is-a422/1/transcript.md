# Transcript: An unknown credit pack is a 422 on packId

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#unknownPackIsA422` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-18ec2140-af46-4107-9046-86743a179622` |
| 2 | `POST /v1/auth/token` | 200 | 11 | `qa-2bf26e30-5916-4a2b-8709-c3d9e94d6299` |
| 3 | `POST /v1/credits/purchases` | 422 | 12 | `qa-3c0ffa55-3e75-4220-a863-f5e1964c2b03` |
| 4 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-706fd5bd-8c31-4d3f-9e17-a7eea45b7ce5` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-d0619571-d131-4e82-8dad-cd7891a27428` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-18ec2140-af46-4107-9046-86743a179622

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18ec2140-af46-4107-9046-86743a179622
Content-Type: application/json

--- request body ---
{"handle":"qa-bd016f7e3abd","displayName":"QA bd016f7e3abd","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-18ec2140-af46-4107-9046-86743a179622
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-bd016f7e3abd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0d52d8d4-3190-4ee7-8701-3f8236332953","handle":"qa-bd016f7e3abd","displayName":"QA bd016f7e3abd","region":"eu","role":"user","createdAt":"2026-11-16T09:53:55.035128319Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2bf26e30-5916-4a2b-8709-c3d9e94d6299

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bf26e30-5916-4a2b-8709-c3d9e94d6299
Content-Type: application/json

--- request body ---
{"handle":"qa-bd016f7e3abd","password":"****"}

--- response: 200 in 11 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bf26e30-5916-4a2b-8709-c3d9e94d6299
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0d52d8d4-3190-4ee7-8701-3f8236332953"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-3c0ffa55-3e75-4220-a863-f5e1964c2b03

--- request headers ---
Accept: application/json
Idempotency-Key: qa-2698d062c589446ea6e21b434fdd7d36
X-Correlation-Id: qa-3c0ffa55-3e75-4220-a863-f5e1964c2b03
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c0ffa55-3e75-4220-a863-f5e1964c2b03
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-3c0ffa55-3e75-4220-a863-f5e1964c2b03","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-706fd5bd-8c31-4d3f-9e17-a7eea45b7ce5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-706fd5bd-8c31-4d3f-9e17-a7eea45b7ce5
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-706fd5bd-8c31-4d3f-9e17-a7eea45b7ce5
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-d0619571-d131-4e82-8dad-cd7891a27428

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0619571-d131-4e82-8dad-cd7891a27428
Content-Type: application/json

--- request body ---
{"handle":"qa-bd016f7e3abd","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d0619571-d131-4e82-8dad-cd7891a27428
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d0619571-d131-4e82-8dad-cd7891a27428"}
```
