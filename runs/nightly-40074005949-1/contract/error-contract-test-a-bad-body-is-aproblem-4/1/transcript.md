# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-625c8fe6-5ae8-4afa-9445-da6092ee0a29` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-d3a0cb39-d878-46c5-8801-6e8e2a2bac9a` |
| 3 | `POST /v1/auth/token` | 200 | 26 | `qa-f7ff3cad-09b2-40a2-a53c-8f8119831551` |
| 4 | `POST /v1/conversations` | 201 | 24 | `qa-2ad8c8ab-e948-4513-a79e-178fa2f54963` |
| 5 | `POST /v1/accounts` | 415 | 8 | `qa-c83837e5-499d-4d00-ab94-7269c515ab43` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-f38d14a9-56dc-490b-8416-17a81ddbac28` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-540b93ba-e23e-4f48-8dc2-ce311b5bb171` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-e9c80aee-7294-4ec0-902b-65cb3ab91dde` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-8e996430-7001-43aa-98c2-9cf2d24088da` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-281fdcd8-74d2-4b16-b500-4604e042e598` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-625c8fe6-5ae8-4afa-9445-da6092ee0a29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-625c8fe6-5ae8-4afa-9445-da6092ee0a29
Content-Type: application/json

--- request body ---
{"handle":"qa-05d7b8e46754","displayName":"QA 05d7b8e46754","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-625c8fe6-5ae8-4afa-9445-da6092ee0a29
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Location: /v1/accounts/qa-05d7b8e46754
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7185474e-62c5-4135-9e27-5d44a2e87cdd","handle":"qa-05d7b8e46754","displayName":"QA 05d7b8e46754","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.956181299Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d3a0cb39-d878-46c5-8801-6e8e2a2bac9a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3a0cb39-d878-46c5-8801-6e8e2a2bac9a
Content-Type: application/json

--- request body ---
{"handle":"qa-450f5c561d6a","displayName":"QA 450f5c561d6a","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3a0cb39-d878-46c5-8801-6e8e2a2bac9a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Location: /v1/accounts/qa-450f5c561d6a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_797a3159-348d-46dc-b9cf-12cd27ce0281","handle":"qa-450f5c561d6a","displayName":"QA 450f5c561d6a","region":"eu","role":"user","createdAt":"2026-10-24T07:25:03.004314412Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f7ff3cad-09b2-40a2-a53c-8f8119831551

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7ff3cad-09b2-40a2-a53c-8f8119831551
Content-Type: application/json

--- request body ---
{"handle":"qa-05d7b8e46754","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7ff3cad-09b2-40a2-a53c-8f8119831551
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7185474e-62c5-4135-9e27-5d44a2e87cdd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-2ad8c8ab-e948-4513-a79e-178fa2f54963

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ad8c8ab-e948-4513-a79e-178fa2f54963
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-450f5c561d6a","subject":"Error contract","message":"Hi"}

--- response: 201 in 24 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ad8c8ab-e948-4513-a79e-178fa2f54963
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
Location: /v1/conversations/cnv_d8ad6442-3592-4726-83c1-5c8fafa9a124
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d8ad6442-3592-4726-83c1-5c8fafa9a124","subject":"Error contract","status":"open","region":"eu","participants":["qa-05d7b8e46754","qa-450f5c561d6a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:03.065539139Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-c83837e5-499d-4d00-ab94-7269c515ab43

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c83837e5-499d-4d00-ab94-7269c515ab43
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c83837e5-499d-4d00-ab94-7269c515ab43
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-c83837e5-499d-4d00-ab94-7269c515ab43"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f38d14a9-56dc-490b-8416-17a81ddbac28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f38d14a9-56dc-490b-8416-17a81ddbac28
Content-Type: application/json

--- request body ---
{"handle":"qa-450f5c561d6a","password":"****"}

--- response: 200 in 13 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-f38d14a9-56dc-490b-8416-17a81ddbac28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_797a3159-348d-46dc-b9cf-12cd27ce0281"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-540b93ba-e23e-4f48-8dc2-ce311b5bb171

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-540b93ba-e23e-4f48-8dc2-ce311b5bb171
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-540b93ba-e23e-4f48-8dc2-ce311b5bb171
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
correlation: qa-e9c80aee-7294-4ec0-902b-65cb3ab91dde

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9c80aee-7294-4ec0-902b-65cb3ab91dde
Content-Type: application/json

--- request body ---
{"handle":"qa-450f5c561d6a","password":"****"}

--- response: 401 in 15 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9c80aee-7294-4ec0-902b-65cb3ab91dde
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e9c80aee-7294-4ec0-902b-65cb3ab91dde"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e996430-7001-43aa-98c2-9cf2d24088da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e996430-7001-43aa-98c2-9cf2d24088da
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e996430-7001-43aa-98c2-9cf2d24088da
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
correlation: qa-281fdcd8-74d2-4b16-b500-4604e042e598

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-281fdcd8-74d2-4b16-b500-4604e042e598
Content-Type: application/json

--- request body ---
{"handle":"qa-05d7b8e46754","password":"****"}

--- response: 401 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-281fdcd8-74d2-4b16-b500-4604e042e598
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-281fdcd8-74d2-4b16-b500-4604e042e598"}
```
