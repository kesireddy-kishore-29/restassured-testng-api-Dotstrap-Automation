# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-f265323e-906b-489a-ac6e-a6d05b538366` |
| 2 | `POST /v1/auth/token` | 200 | 22 | `qa-7042f8b9-1795-4413-84a7-d8d6d54ca2e7` |
| 3 | `GET /v1/conversations/{id}` | 404 | 7 | `qa-37b107a9-1977-4b5f-bf24-821ddaca026d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-35126609-1053-4366-a873-13da80b51d8f` |
| 5 | `POST /v1/auth/token` | 401 | 6 | `qa-501b0fd7-cd5e-4957-a677-5c7ebbb8defb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f265323e-906b-489a-ac6e-a6d05b538366

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f265323e-906b-489a-ac6e-a6d05b538366
Content-Type: application/json

--- request body ---
{"handle":"qa-95be6c0d01da","displayName":"QA 95be6c0d01da","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f265323e-906b-489a-ac6e-a6d05b538366
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 309
RateLimit-Reset: 6
Location: /v1/accounts/qa-95be6c0d01da
X-Served-Region: eu
Content-Length: 181

{"id":"acc_aa931ef7-217f-47c5-8f7d-30990e9be227","handle":"qa-95be6c0d01da","displayName":"QA 95be6c0d01da","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.132188388Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7042f8b9-1795-4413-84a7-d8d6d54ca2e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7042f8b9-1795-4413-84a7-d8d6d54ca2e7
Content-Type: application/json

--- request body ---
{"handle":"qa-95be6c0d01da","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-7042f8b9-1795-4413-84a7-d8d6d54ca2e7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 301
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_aa931ef7-217f-47c5-8f7d-30990e9be227"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-37b107a9-1977-4b5f-bf24-821ddaca026d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37b107a9-1977-4b5f-bf24-821ddaca026d
Content-Type: application/json

--- response: 404 in 7 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37b107a9-1977-4b5f-bf24-821ddaca026d
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

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-37b107a9-1977-4b5f-bf24-821ddaca026d"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-35126609-1053-4366-a873-13da80b51d8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35126609-1053-4366-a873-13da80b51d8f
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-35126609-1053-4366-a873-13da80b51d8f
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
correlation: qa-501b0fd7-cd5e-4957-a677-5c7ebbb8defb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-501b0fd7-cd5e-4957-a677-5c7ebbb8defb
Content-Type: application/json

--- request body ---
{"handle":"qa-95be6c0d01da","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-501b0fd7-cd5e-4957-a677-5c7ebbb8defb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-501b0fd7-cd5e-4957-a677-5c7ebbb8defb"}
```
