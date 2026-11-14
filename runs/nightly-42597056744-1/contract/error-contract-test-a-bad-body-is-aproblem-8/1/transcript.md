# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[8]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-b450b735-9c9e-47e2-8557-1d994808736d` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-521e997d-6cb8-43cc-927c-7dc566c749fa` |
| 3 | `POST /v1/auth/token` | 200 | 11 | `qa-e3d08b9d-62aa-499a-813d-a8f5289daf14` |
| 4 | `POST /v1/conversations` | 201 | 9 | `qa-e290b62f-d64c-4af3-8f0e-407e4f186590` |
| 5 | `PATCH /v1/accounts/me` | 422 | 21 | `qa-df529bf7-02fc-4710-8dad-a39c1bd0bb63` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-86b39e7c-0fb8-4806-9106-79800666f8a0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-521b7fdd-518c-4bdb-ae13-bb8bb347c007` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-593a145f-8a0e-47bc-b5f3-5988c4dc5943` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-6bb5afd1-7540-43b0-8b1f-4255c31cf6dd` |
| 10 | `POST /v1/auth/token` | 401 | 3 | `qa-0d95396e-720f-4e48-8b85-55f0be3617cc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b450b735-9c9e-47e2-8557-1d994808736d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b450b735-9c9e-47e2-8557-1d994808736d
Content-Type: application/json

--- request body ---
{"handle":"qa-0ae3ee2966e4","displayName":"QA 0ae3ee2966e4","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-b450b735-9c9e-47e2-8557-1d994808736d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 427
RateLimit-Reset: 8
Location: /v1/accounts/qa-0ae3ee2966e4
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c239a2e7-9649-4944-a903-f166b2c9631f","handle":"qa-0ae3ee2966e4","displayName":"QA 0ae3ee2966e4","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.238869708Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-521e997d-6cb8-43cc-927c-7dc566c749fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-521e997d-6cb8-43cc-927c-7dc566c749fa
Content-Type: application/json

--- request body ---
{"handle":"qa-0ca0505cca2b","displayName":"QA 0ca0505cca2b","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-521e997d-6cb8-43cc-927c-7dc566c749fa
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
Location: /v1/accounts/qa-0ca0505cca2b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ebf53142-67c0-44c1-8090-067ffafb775c","handle":"qa-0ca0505cca2b","displayName":"QA 0ca0505cca2b","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.256440602Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e3d08b9d-62aa-499a-813d-a8f5289daf14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3d08b9d-62aa-499a-813d-a8f5289daf14
Content-Type: application/json

--- request body ---
{"handle":"qa-0ae3ee2966e4","password":"****"}

--- response: 200 in 11 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3d08b9d-62aa-499a-813d-a8f5289daf14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 418
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c239a2e7-9649-4944-a903-f166b2c9631f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e290b62f-d64c-4af3-8f0e-407e4f186590

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e290b62f-d64c-4af3-8f0e-407e4f186590
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0ca0505cca2b","subject":"Error contract","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e290b62f-d64c-4af3-8f0e-407e4f186590
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
Location: /v1/conversations/cnv_55abde6b-1c26-40da-9175-8dca8cf8003c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_55abde6b-1c26-40da-9175-8dca8cf8003c","subject":"Error contract","status":"open","region":"eu","participants":["qa-0ae3ee2966e4","qa-0ca0505cca2b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.283841718Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-df529bf7-02fc-4710-8dad-a39c1bd0bb63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df529bf7-02fc-4710-8dad-a39c1bd0bb63
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 21 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df529bf7-02fc-4710-8dad-a39c1bd0bb63
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
Content-Length: 316

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-df529bf7-02fc-4710-8dad-a39c1bd0bb63","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-86b39e7c-0fb8-4806-9106-79800666f8a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86b39e7c-0fb8-4806-9106-79800666f8a0
Content-Type: application/json

--- request body ---
{"handle":"qa-0ca0505cca2b","password":"****"}

--- response: 200 in 20 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-86b39e7c-0fb8-4806-9106-79800666f8a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ebf53142-67c0-44c1-8090-067ffafb775c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-521b7fdd-518c-4bdb-ae13-bb8bb347c007

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-521b7fdd-518c-4bdb-ae13-bb8bb347c007
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-521b7fdd-518c-4bdb-ae13-bb8bb347c007
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
correlation: qa-593a145f-8a0e-47bc-b5f3-5988c4dc5943

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-593a145f-8a0e-47bc-b5f3-5988c4dc5943
Content-Type: application/json

--- request body ---
{"handle":"qa-0ca0505cca2b","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-593a145f-8a0e-47bc-b5f3-5988c4dc5943
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-593a145f-8a0e-47bc-b5f3-5988c4dc5943"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6bb5afd1-7540-43b0-8b1f-4255c31cf6dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bb5afd1-7540-43b0-8b1f-4255c31cf6dd
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6bb5afd1-7540-43b0-8b1f-4255c31cf6dd
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
correlation: qa-0d95396e-720f-4e48-8b85-55f0be3617cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d95396e-720f-4e48-8b85-55f0be3617cc
Content-Type: application/json

--- request body ---
{"handle":"qa-0ae3ee2966e4","password":"****"}

--- response: 401 in 3 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d95396e-720f-4e48-8b85-55f0be3617cc
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0d95396e-720f-4e48-8b85-55f0be3617cc"}
```
