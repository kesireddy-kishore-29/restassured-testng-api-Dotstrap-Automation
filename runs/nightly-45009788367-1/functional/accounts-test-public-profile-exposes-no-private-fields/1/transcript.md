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
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-1dc84006-32de-4c29-9318-4819be64ccad` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-7b4c8e2b-1c74-44cf-8cff-235e9c91bc19` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-7b0e5f7e-09e6-4267-a2d4-a5ee64137b3a` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 11 | `qa-9dfaeb23-265f-4919-bdf6-aafa177567fb` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 11 | `qa-231c1f2b-9fcd-48ee-93f0-fff9bb3c037c` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 10 | `qa-97438a46-4816-437a-997c-00b19c4a52f6` |
| 7 | `POST /v1/auth/token` | 200 | 16 | `qa-d133aab2-dbf2-46a9-bfde-ff874489a5af` |
| 8 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-938f604e-89f1-4e48-968a-c1c077482af7` |
| 9 | `POST /v1/auth/token` | 401 | 26 | `qa-dcfba9f7-7954-44e9-8864-39c03d24f17d` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-b15703ea-1f1d-485f-98ce-4d18c083e378` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-2f71640b-6b8e-4a25-886f-7f1439905d2a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1dc84006-32de-4c29-9318-4819be64ccad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dc84006-32de-4c29-9318-4819be64ccad
Content-Type: application/json

--- request body ---
{"handle":"qa-f5234910f6a8","displayName":"QA f5234910f6a8","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-1dc84006-32de-4c29-9318-4819be64ccad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-f5234910f6a8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_789e9d0f-aa37-42de-9642-ff3dc16cd683","handle":"qa-f5234910f6a8","displayName":"QA f5234910f6a8","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.070331510Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7b4c8e2b-1c74-44cf-8cff-235e9c91bc19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b4c8e2b-1c74-44cf-8cff-235e9c91bc19
Content-Type: application/json

--- request body ---
{"handle":"qa-de10063a65e8","displayName":"QA de10063a65e8","password":"****","region":"us"}

--- response: 201 in 20 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b4c8e2b-1c74-44cf-8cff-235e9c91bc19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-de10063a65e8
X-Served-Region: us
Content-Length: 181

{"id":"acc_495418a4-7e8a-433d-b929-853a356d05f0","handle":"qa-de10063a65e8","displayName":"QA de10063a65e8","region":"us","role":"user","createdAt":"2026-11-22T09:54:55.099633539Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7b0e5f7e-09e6-4267-a2d4-a5ee64137b3a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b0e5f7e-09e6-4267-a2d4-a5ee64137b3a
Content-Type: application/json

--- request body ---
{"handle":"qa-f5234910f6a8","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b0e5f7e-09e6-4267-a2d4-a5ee64137b3a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_789e9d0f-aa37-42de-9642-ff3dc16cd683"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-de10063a65e8
correlation: qa-9dfaeb23-265f-4919-bdf6-aafa177567fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dfaeb23-265f-4919-bdf6-aafa177567fb
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-9dfaeb23-265f-4919-bdf6-aafa177567fb
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

{"handle":"qa-de10063a65e8","displayName":"QA de10063a65e8","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-de10063a65e8
correlation: qa-231c1f2b-9fcd-48ee-93f0-fff9bb3c037c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-231c1f2b-9fcd-48ee-93f0-fff9bb3c037c
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-231c1f2b-9fcd-48ee-93f0-fff9bb3c037c
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

{"handle":"qa-de10063a65e8","displayName":"QA de10063a65e8","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-de10063a65e8
correlation: qa-97438a46-4816-437a-997c-00b19c4a52f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97438a46-4816-437a-997c-00b19c4a52f6
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-97438a46-4816-437a-997c-00b19c4a52f6
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

{"handle":"qa-de10063a65e8","displayName":"QA de10063a65e8","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-d133aab2-dbf2-46a9-bfde-ff874489a5af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d133aab2-dbf2-46a9-bfde-ff874489a5af
Content-Type: application/json

--- request body ---
{"handle":"qa-de10063a65e8","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-d133aab2-dbf2-46a9-bfde-ff874489a5af
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_495418a4-7e8a-433d-b929-853a356d05f0"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-938f604e-89f1-4e48-968a-c1c077482af7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-938f604e-89f1-4e48-968a-c1c077482af7
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-938f604e-89f1-4e48-968a-c1c077482af7
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
correlation: qa-dcfba9f7-7954-44e9-8864-39c03d24f17d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcfba9f7-7954-44e9-8864-39c03d24f17d
Content-Type: application/json

--- request body ---
{"handle":"qa-de10063a65e8","password":"****"}

--- response: 401 in 26 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dcfba9f7-7954-44e9-8864-39c03d24f17d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dcfba9f7-7954-44e9-8864-39c03d24f17d"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b15703ea-1f1d-485f-98ce-4d18c083e378

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b15703ea-1f1d-485f-98ce-4d18c083e378
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b15703ea-1f1d-485f-98ce-4d18c083e378
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
correlation: qa-2f71640b-6b8e-4a25-886f-7f1439905d2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f71640b-6b8e-4a25-886f-7f1439905d2a
Content-Type: application/json

--- request body ---
{"handle":"qa-f5234910f6a8","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f71640b-6b8e-4a25-886f-7f1439905d2a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2f71640b-6b8e-4a25-886f-7f1439905d2a"}
```
