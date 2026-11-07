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
| 1 | `POST /v1/accounts` | 201 | 38 | `qa-a8de928c-b686-4cb6-abc7-55bfb2afae80` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-a90f4500-7908-4457-af9f-e0b5721136e2` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-9183e234-174c-4a09-8eca-7ec2475767a7` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-9de34b52-d0a0-4097-b787-e798db2c5bb0` |
| 5 | `PATCH /v1/accounts/me` | 422 | 35 | `qa-498d77f6-90d6-4863-a042-90df55c2beee` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-c6c37ff7-cecd-4c80-8979-e09d4a2a21d5` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-8aae8d60-84ff-43b7-98c9-f9282ce66b03` |
| 8 | `POST /v1/auth/token` | 401 | 26 | `qa-230b3ab9-4537-4368-815d-acca8c2d34ba` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-b77b065d-b101-4e7f-8b0b-e6362293207c` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-1861b9e3-4a92-4f07-b371-2f41b39a7355` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a8de928c-b686-4cb6-abc7-55bfb2afae80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8de928c-b686-4cb6-abc7-55bfb2afae80
Content-Type: application/json

--- request body ---
{"handle":"qa-905cbdc27c85","displayName":"QA 905cbdc27c85","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sun, 01 Nov 2026 09:23:22 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8de928c-b686-4cb6-abc7-55bfb2afae80
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Location: /v1/accounts/qa-905cbdc27c85
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e5a8c48e-7cde-4924-90b5-d02d249993e3","handle":"qa-905cbdc27c85","displayName":"QA 905cbdc27c85","region":"eu","role":"user","createdAt":"2026-11-01T09:23:22.967281075Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a90f4500-7908-4457-af9f-e0b5721136e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a90f4500-7908-4457-af9f-e0b5721136e2
Content-Type: application/json

--- request body ---
{"handle":"qa-cc3ffb8116cb","displayName":"QA cc3ffb8116cb","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-a90f4500-7908-4457-af9f-e0b5721136e2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 433
RateLimit-Reset: 8
Location: /v1/accounts/qa-cc3ffb8116cb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4c462593-37de-4199-aae6-2e2e7161d8ff","handle":"qa-cc3ffb8116cb","displayName":"QA cc3ffb8116cb","region":"eu","role":"user","createdAt":"2026-11-01T09:23:23.018482268Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9183e234-174c-4a09-8eca-7ec2475767a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9183e234-174c-4a09-8eca-7ec2475767a7
Content-Type: application/json

--- request body ---
{"handle":"qa-905cbdc27c85","password":"****"}

--- response: 200 in 31 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-9183e234-174c-4a09-8eca-7ec2475767a7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e5a8c48e-7cde-4924-90b5-d02d249993e3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9de34b52-d0a0-4097-b787-e798db2c5bb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9de34b52-d0a0-4097-b787-e798db2c5bb0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-cc3ffb8116cb","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-9de34b52-d0a0-4097-b787-e798db2c5bb0
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
Location: /v1/conversations/cnv_cf74ad92-7691-4f1e-b74c-d14193d979ab
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_cf74ad92-7691-4f1e-b74c-d14193d979ab","subject":"Error contract","status":"open","region":"eu","participants":["qa-905cbdc27c85","qa-cc3ffb8116cb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-01T09:23:23.091152514Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-498d77f6-90d6-4863-a042-90df55c2beee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-498d77f6-90d6-4863-a042-90df55c2beee
Content-Type: application/json

--- request body ---
{"displayName":"   "}

--- response: 422 in 35 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-498d77f6-90d6-4863-a042-90df55c2beee
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts/me","correlationId":"qa-498d77f6-90d6-4863-a042-90df55c2beee","errors":[{"field":"displayName","message":"1-60 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c6c37ff7-cecd-4c80-8979-e09d4a2a21d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6c37ff7-cecd-4c80-8979-e09d4a2a21d5
Content-Type: application/json

--- request body ---
{"handle":"qa-cc3ffb8116cb","password":"****"}

--- response: 200 in 28 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6c37ff7-cecd-4c80-8979-e09d4a2a21d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4c462593-37de-4199-aae6-2e2e7161d8ff"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8aae8d60-84ff-43b7-98c9-f9282ce66b03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8aae8d60-84ff-43b7-98c9-f9282ce66b03
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8aae8d60-84ff-43b7-98c9-f9282ce66b03
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
correlation: qa-230b3ab9-4537-4368-815d-acca8c2d34ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-230b3ab9-4537-4368-815d-acca8c2d34ba
Content-Type: application/json

--- request body ---
{"handle":"qa-cc3ffb8116cb","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-230b3ab9-4537-4368-815d-acca8c2d34ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-230b3ab9-4537-4368-815d-acca8c2d34ba"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b77b065d-b101-4e7f-8b0b-e6362293207c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b77b065d-b101-4e7f-8b0b-e6362293207c
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b77b065d-b101-4e7f-8b0b-e6362293207c
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
correlation: qa-1861b9e3-4a92-4f07-b371-2f41b39a7355

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1861b9e3-4a92-4f07-b371-2f41b39a7355
Content-Type: application/json

--- request body ---
{"handle":"qa-905cbdc27c85","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 01 Nov 2026 09:23:23 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1861b9e3-4a92-4f07-b371-2f41b39a7355
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1861b9e3-4a92-4f07-b371-2f41b39a7355"}
```
