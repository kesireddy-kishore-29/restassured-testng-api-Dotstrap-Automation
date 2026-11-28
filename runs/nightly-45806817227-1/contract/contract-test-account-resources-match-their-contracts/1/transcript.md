# Transcript: Account, token and public profile match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#accountResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01, FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-09f3dc9f-9964-4b1d-9598-5ac8affddc87` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-314c33fc-6a7b-4f64-beee-cac4cf6e1e70` |
| 3 | `POST /v1/auth/token` | 200 | 13 | `qa-2d1004d7-d745-43ac-9eae-ecbab548bb95` |
| 4 | `POST /v1/auth/token` | 200 | 11 | `qa-86c13458-96d5-4d50-87b7-97391366ad36` |
| 5 | `GET /v1/accounts/me` | 200 | 13 | `qa-7df74172-59b1-4130-a9a9-7884ea55cecb` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 8 | `qa-1e930e75-ec98-454f-8585-42f61f83cd3b` |
| 7 | `POST /v1/auth/token` | 200 | 15 | `qa-844e7394-3f3f-4111-b472-99ed59856603` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-0416a771-42f9-4eb3-b893-67aa0680fa48` |
| 9 | `POST /v1/auth/token` | 401 | 11 | `qa-a74e564d-7140-4494-8115-c7a35c2129ff` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-3c78ae7f-f630-43b2-9876-79ac57166175` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-84cea1ac-9ffd-4d8b-b246-a70ffd9c84db` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-09f3dc9f-9964-4b1d-9598-5ac8affddc87

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09f3dc9f-9964-4b1d-9598-5ac8affddc87
Content-Type: application/json

--- request body ---
{"handle":"qa-b22cc4c164ef","displayName":"QA b22cc4c164ef","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-09f3dc9f-9964-4b1d-9598-5ac8affddc87
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-b22cc4c164ef
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e91473d0-01e5-4d8f-8415-507f736021d7","handle":"qa-b22cc4c164ef","displayName":"QA b22cc4c164ef","region":"eu","role":"user","createdAt":"2026-11-26T11:02:34.599937983Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-314c33fc-6a7b-4f64-beee-cac4cf6e1e70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-314c33fc-6a7b-4f64-beee-cac4cf6e1e70
Content-Type: application/json

--- request body ---
{"handle":"qa-b22791866739","displayName":"QA b22791866739","password":"****","region":"us"}

--- response: 201 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-314c33fc-6a7b-4f64-beee-cac4cf6e1e70
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Location: /v1/accounts/qa-b22791866739
X-Served-Region: us
Content-Length: 181

{"id":"acc_2fff3045-4a13-4d4d-89bd-5489fbf6749a","handle":"qa-b22791866739","displayName":"QA b22791866739","region":"us","role":"user","createdAt":"2026-11-26T11:02:34.628467357Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2d1004d7-d745-43ac-9eae-ecbab548bb95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d1004d7-d745-43ac-9eae-ecbab548bb95
Content-Type: application/json

--- request body ---
{"handle":"qa-b22cc4c164ef","password":"****"}

--- response: 200 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d1004d7-d745-43ac-9eae-ecbab548bb95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e91473d0-01e5-4d8f-8415-507f736021d7"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-86c13458-96d5-4d50-87b7-97391366ad36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86c13458-96d5-4d50-87b7-97391366ad36
Content-Type: application/json

--- request body ---
{"handle":"qa-b22cc4c164ef","password":"****"}

--- response: 200 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-86c13458-96d5-4d50-87b7-97391366ad36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e91473d0-01e5-4d8f-8415-507f736021d7"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-7df74172-59b1-4130-a9a9-7884ea55cecb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7df74172-59b1-4130-a9a9-7884ea55cecb
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7df74172-59b1-4130-a9a9-7884ea55cecb
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
Content-Length: 181

{"id":"acc_e91473d0-01e5-4d8f-8415-507f736021d7","handle":"qa-b22cc4c164ef","displayName":"QA b22cc4c164ef","region":"eu","role":"user","createdAt":"2026-11-26T11:02:34.599937983Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-b22791866739
correlation: qa-1e930e75-ec98-454f-8585-42f61f83cd3b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e930e75-ec98-454f-8585-42f61f83cd3b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e930e75-ec98-454f-8585-42f61f83cd3b
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
Content-Length: 74

{"handle":"qa-b22791866739","displayName":"QA b22791866739","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-844e7394-3f3f-4111-b472-99ed59856603

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-844e7394-3f3f-4111-b472-99ed59856603
Content-Type: application/json

--- request body ---
{"handle":"qa-b22791866739","password":"****"}

--- response: 200 in 15 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-844e7394-3f3f-4111-b472-99ed59856603
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2fff3045-4a13-4d4d-89bd-5489fbf6749a"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0416a771-42f9-4eb3-b893-67aa0680fa48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0416a771-42f9-4eb3-b893-67aa0680fa48
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0416a771-42f9-4eb3-b893-67aa0680fa48
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
X-Served-Region: us
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-a74e564d-7140-4494-8115-c7a35c2129ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a74e564d-7140-4494-8115-c7a35c2129ff
Content-Type: application/json

--- request body ---
{"handle":"qa-b22791866739","password":"****"}

--- response: 401 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a74e564d-7140-4494-8115-c7a35c2129ff
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a74e564d-7140-4494-8115-c7a35c2129ff"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3c78ae7f-f630-43b2-9876-79ac57166175

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c78ae7f-f630-43b2-9876-79ac57166175
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3c78ae7f-f630-43b2-9876-79ac57166175
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-84cea1ac-9ffd-4d8b-b246-a70ffd9c84db

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84cea1ac-9ffd-4d8b-b246-a70ffd9c84db
Content-Type: application/json

--- request body ---
{"handle":"qa-b22cc4c164ef","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-84cea1ac-9ffd-4d8b-b246-a70ffd9c84db
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-84cea1ac-9ffd-4d8b-b246-a70ffd9c84db"}
```
