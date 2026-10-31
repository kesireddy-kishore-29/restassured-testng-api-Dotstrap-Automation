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
| 1 | `POST /v1/accounts` | 201 | 369 | `qa-002db859-a1fc-4377-81cf-40a20deb1de0` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-36fc1f30-96a7-4153-a102-d93e8842744a` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-ddb3aea6-0bdf-4e53-823b-b56c3f61ca58` |
| 4 | `POST /v1/auth/token` | 200 | 36 | `qa-d7754515-f696-4548-80aa-a12ec4810c8b` |
| 5 | `GET /v1/accounts/me` | 200 | 23 | `qa-dd5d0b1b-6483-4bd3-818c-578e3baa877e` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 49 | `qa-4446f5ac-bb69-4552-a6b7-6431c84eadd2` |
| 7 | `POST /v1/auth/token` | 200 | 14 | `qa-24da14cc-c76c-40b1-bc81-ede5dc30dff1` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-8d01479c-2f40-4e1d-8de2-dd9ef615c920` |
| 9 | `POST /v1/auth/token` | 401 | 19 | `qa-3bb052e5-3339-4f88-9e6c-61e5913e81c6` |
| 10 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-1c941a53-f0cb-4df8-8517-f8bec71b3bbf` |
| 11 | `POST /v1/auth/token` | 401 | 13 | `qa-d17f4ff9-68ee-44ba-9079-fbb2a0ab8729` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-002db859-a1fc-4377-81cf-40a20deb1de0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-002db859-a1fc-4377-81cf-40a20deb1de0
Content-Type: application/json

--- request body ---
{"handle":"qa-4242e76d3e33","displayName":"QA 4242e76d3e33","password":"****","region":"eu"}

--- response: 201 in 369 ms ---
Date: Sun, 25 Oct 2026 07:40:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-002db859-a1fc-4377-81cf-40a20deb1de0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-4242e76d3e33
X-Served-Region: eu
Content-Length: 181

{"id":"acc_426ad370-aa8e-4af3-82ea-69b81faa90d4","handle":"qa-4242e76d3e33","displayName":"QA 4242e76d3e33","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.059456128Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-36fc1f30-96a7-4153-a102-d93e8842744a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36fc1f30-96a7-4153-a102-d93e8842744a
Content-Type: application/json

--- request body ---
{"handle":"qa-8108e8e7cdfa","displayName":"QA 8108e8e7cdfa","password":"****","region":"us"}

--- response: 201 in 38 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-36fc1f30-96a7-4153-a102-d93e8842744a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-8108e8e7cdfa
X-Served-Region: us
Content-Length: 181

{"id":"acc_c681d8a0-5fa4-4cb0-ab97-24b474aea920","handle":"qa-8108e8e7cdfa","displayName":"QA 8108e8e7cdfa","region":"us","role":"user","createdAt":"2026-10-25T07:40:24.434546795Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ddb3aea6-0bdf-4e53-823b-b56c3f61ca58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddb3aea6-0bdf-4e53-823b-b56c3f61ca58
Content-Type: application/json

--- request body ---
{"handle":"qa-4242e76d3e33","password":"****"}

--- response: 200 in 47 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddb3aea6-0bdf-4e53-823b-b56c3f61ca58
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_426ad370-aa8e-4af3-82ea-69b81faa90d4"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d7754515-f696-4548-80aa-a12ec4810c8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7754515-f696-4548-80aa-a12ec4810c8b
Content-Type: application/json

--- request body ---
{"handle":"qa-4242e76d3e33","password":"****"}

--- response: 200 in 36 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-d7754515-f696-4548-80aa-a12ec4810c8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_426ad370-aa8e-4af3-82ea-69b81faa90d4"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-dd5d0b1b-6483-4bd3-818c-578e3baa877e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd5d0b1b-6483-4bd3-818c-578e3baa877e
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd5d0b1b-6483-4bd3-818c-578e3baa877e
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

{"id":"acc_426ad370-aa8e-4af3-82ea-69b81faa90d4","handle":"qa-4242e76d3e33","displayName":"QA 4242e76d3e33","region":"eu","role":"user","createdAt":"2026-10-25T07:40:24.059456128Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-8108e8e7cdfa
correlation: qa-4446f5ac-bb69-4552-a6b7-6431c84eadd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4446f5ac-bb69-4552-a6b7-6431c84eadd2
Content-Type: application/json

--- response: 200 in 49 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-4446f5ac-bb69-4552-a6b7-6431c84eadd2
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

{"handle":"qa-8108e8e7cdfa","displayName":"QA 8108e8e7cdfa","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-24da14cc-c76c-40b1-bc81-ede5dc30dff1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24da14cc-c76c-40b1-bc81-ede5dc30dff1
Content-Type: application/json

--- request body ---
{"handle":"qa-8108e8e7cdfa","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-24da14cc-c76c-40b1-bc81-ede5dc30dff1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c681d8a0-5fa4-4cb0-ab97-24b474aea920"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8d01479c-2f40-4e1d-8de2-dd9ef615c920

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d01479c-2f40-4e1d-8de2-dd9ef615c920
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8d01479c-2f40-4e1d-8de2-dd9ef615c920
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
correlation: qa-3bb052e5-3339-4f88-9e6c-61e5913e81c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bb052e5-3339-4f88-9e6c-61e5913e81c6
Content-Type: application/json

--- request body ---
{"handle":"qa-8108e8e7cdfa","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3bb052e5-3339-4f88-9e6c-61e5913e81c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3bb052e5-3339-4f88-9e6c-61e5913e81c6"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1c941a53-f0cb-4df8-8517-f8bec71b3bbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c941a53-f0cb-4df8-8517-f8bec71b3bbf
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1c941a53-f0cb-4df8-8517-f8bec71b3bbf
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
correlation: qa-d17f4ff9-68ee-44ba-9079-fbb2a0ab8729

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d17f4ff9-68ee-44ba-9079-fbb2a0ab8729
Content-Type: application/json

--- request body ---
{"handle":"qa-4242e76d3e33","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 25 Oct 2026 07:40:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d17f4ff9-68ee-44ba-9079-fbb2a0ab8729
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d17f4ff9-68ee-44ba-9079-fbb2a0ab8729"}
```
