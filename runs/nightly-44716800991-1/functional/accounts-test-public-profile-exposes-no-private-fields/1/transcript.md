# Transcript: Anyone signed in sees a public profile with no private fields

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#publicProfileExposesNoPrivateFields` |
| Features | FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-e2aaba7d-47be-4208-bdc1-b90bf9d4727e` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-51ef2cb7-28e5-4b78-9026-3473a262f2c9` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-7e090555-eed1-4d3e-8284-5dfd93d83cff` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 18 | `qa-d5fac04c-3807-4e58-95ec-7d836021a3be` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 13 | `qa-e80bece6-dc2c-4c5b-8f3d-03cf73e2bc4d` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 14 | `qa-fc4ccd81-0def-4798-acfa-02c38248ff16` |
| 7 | `POST /v1/auth/token` | 200 | 14 | `qa-b0274b5e-0cd5-468a-baec-1e0eb4f77ada` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-31941e49-92e4-4835-9a21-4b81b716c823` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-03752178-b696-4da5-a9c1-b99dee9b63eb` |
| 10 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-a065869c-1f85-49f8-9fbf-f913f4a68624` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-9fa2686c-ff99-443d-ad5f-2ddcd29cccd8` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e2aaba7d-47be-4208-bdc1-b90bf9d4727e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e2aaba7d-47be-4208-bdc1-b90bf9d4727e
Content-Type: application/json

--- request body ---
{"handle":"qa-21f53853b048","displayName":"QA 21f53853b048","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e2aaba7d-47be-4208-bdc1-b90bf9d4727e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-21f53853b048
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e5844ddc-19bc-4950-b240-ff8b1887eb8c","handle":"qa-21f53853b048","displayName":"QA 21f53853b048","region":"eu","role":"user","createdAt":"2026-11-20T10:10:01.474687298Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-51ef2cb7-28e5-4b78-9026-3473a262f2c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51ef2cb7-28e5-4b78-9026-3473a262f2c9
Content-Type: application/json

--- request body ---
{"handle":"qa-eb66bec13989","displayName":"QA eb66bec13989","password":"****","region":"us"}

--- response: 201 in 16 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-51ef2cb7-28e5-4b78-9026-3473a262f2c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-eb66bec13989
X-Served-Region: us
Content-Length: 181

{"id":"acc_6b41aa03-05cf-4c96-9cf8-7790580f647e","handle":"qa-eb66bec13989","displayName":"QA eb66bec13989","region":"us","role":"user","createdAt":"2026-11-20T10:10:01.508191498Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7e090555-eed1-4d3e-8284-5dfd93d83cff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e090555-eed1-4d3e-8284-5dfd93d83cff
Content-Type: application/json

--- request body ---
{"handle":"qa-21f53853b048","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-7e090555-eed1-4d3e-8284-5dfd93d83cff
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e5844ddc-19bc-4950-b240-ff8b1887eb8c"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-eb66bec13989
correlation: qa-d5fac04c-3807-4e58-95ec-7d836021a3be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5fac04c-3807-4e58-95ec-7d836021a3be
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5fac04c-3807-4e58-95ec-7d836021a3be
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
Content-Length: 74

{"handle":"qa-eb66bec13989","displayName":"QA eb66bec13989","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-eb66bec13989
correlation: qa-e80bece6-dc2c-4c5b-8f3d-03cf73e2bc4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e80bece6-dc2c-4c5b-8f3d-03cf73e2bc4d
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-e80bece6-dc2c-4c5b-8f3d-03cf73e2bc4d
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

{"handle":"qa-eb66bec13989","displayName":"QA eb66bec13989","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-eb66bec13989
correlation: qa-fc4ccd81-0def-4798-acfa-02c38248ff16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc4ccd81-0def-4798-acfa-02c38248ff16
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc4ccd81-0def-4798-acfa-02c38248ff16
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
Content-Length: 74

{"handle":"qa-eb66bec13989","displayName":"QA eb66bec13989","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-b0274b5e-0cd5-468a-baec-1e0eb4f77ada

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0274b5e-0cd5-468a-baec-1e0eb4f77ada
Content-Type: application/json

--- request body ---
{"handle":"qa-eb66bec13989","password":"****"}

--- response: 200 in 14 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0274b5e-0cd5-468a-baec-1e0eb4f77ada
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6b41aa03-05cf-4c96-9cf8-7790580f647e"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-31941e49-92e4-4835-9a21-4b81b716c823

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31941e49-92e4-4835-9a21-4b81b716c823
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-31941e49-92e4-4835-9a21-4b81b716c823
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
correlation: qa-03752178-b696-4da5-a9c1-b99dee9b63eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03752178-b696-4da5-a9c1-b99dee9b63eb
Content-Type: application/json

--- request body ---
{"handle":"qa-eb66bec13989","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03752178-b696-4da5-a9c1-b99dee9b63eb
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-03752178-b696-4da5-a9c1-b99dee9b63eb"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a065869c-1f85-49f8-9fbf-f913f4a68624

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a065869c-1f85-49f8-9fbf-f913f4a68624
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a065869c-1f85-49f8-9fbf-f913f4a68624
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-9fa2686c-ff99-443d-ad5f-2ddcd29cccd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fa2686c-ff99-443d-ad5f-2ddcd29cccd8
Content-Type: application/json

--- request body ---
{"handle":"qa-21f53853b048","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 20 Nov 2026 10:10:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9fa2686c-ff99-443d-ad5f-2ddcd29cccd8
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9fa2686c-ff99-443d-ad5f-2ddcd29cccd8"}
```
