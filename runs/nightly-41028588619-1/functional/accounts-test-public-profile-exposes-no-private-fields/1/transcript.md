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
| 1 | `POST /v1/accounts` | 201 | 347 | `qa-70d44657-823c-4810-9a03-15a635234311` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-c64516b9-1458-4090-866e-b223fadfc9b3` |
| 3 | `POST /v1/auth/token` | 200 | 25 | `qa-9b5203b5-ba9d-40b4-8a91-bc2d260f6078` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 43 | `qa-382a5a7c-4251-40c2-a4d6-1ad390a66052` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 10 | `qa-ff412cc1-cbe9-48ea-93a6-cc859b8ace34` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 24 | `qa-1b6fcbce-055f-419a-848b-f196d2cdd705` |
| 7 | `POST /v1/auth/token` | 200 | 15 | `qa-2cf33f81-960f-4d0d-92bc-650a8d90c86c` |
| 8 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-4630446c-32bd-439d-bdc1-66018bdf02a6` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-a71f7686-0e65-4f13-8233-bfd35147f7b0` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-21f9c3c4-7c9b-4376-9a6c-6a9730d3caff` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-09535093-f1cb-410f-87d1-45339f78272d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-70d44657-823c-4810-9a03-15a635234311

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70d44657-823c-4810-9a03-15a635234311
Content-Type: application/json

--- request body ---
{"handle":"qa-4a44f849ceda","displayName":"QA 4a44f849ceda","password":"****","region":"eu"}

--- response: 201 in 347 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-70d44657-823c-4810-9a03-15a635234311
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 11
Location: /v1/accounts/qa-4a44f849ceda
X-Served-Region: eu
Content-Length: 181

{"id":"acc_00b7db9d-3be0-4590-9087-63aa20261973","handle":"qa-4a44f849ceda","displayName":"QA 4a44f849ceda","region":"eu","role":"user","createdAt":"2026-10-30T08:46:04.126428013Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c64516b9-1458-4090-866e-b223fadfc9b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c64516b9-1458-4090-866e-b223fadfc9b3
Content-Type: application/json

--- request body ---
{"handle":"qa-b0ff8cab2275","displayName":"QA b0ff8cab2275","password":"****","region":"us"}

--- response: 201 in 40 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c64516b9-1458-4090-866e-b223fadfc9b3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-b0ff8cab2275
X-Served-Region: us
Content-Length: 181

{"id":"acc_687177b1-3be6-40d0-9e38-21383b2720e3","handle":"qa-b0ff8cab2275","displayName":"QA b0ff8cab2275","region":"us","role":"user","createdAt":"2026-10-30T08:46:04.437653861Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-9b5203b5-ba9d-40b4-8a91-bc2d260f6078

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b5203b5-ba9d-40b4-8a91-bc2d260f6078
Content-Type: application/json

--- request body ---
{"handle":"qa-4a44f849ceda","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b5203b5-ba9d-40b4-8a91-bc2d260f6078
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_00b7db9d-3be0-4590-9087-63aa20261973"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-b0ff8cab2275
correlation: qa-382a5a7c-4251-40c2-a4d6-1ad390a66052

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-382a5a7c-4251-40c2-a4d6-1ad390a66052
Content-Type: application/json

--- response: 200 in 43 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-382a5a7c-4251-40c2-a4d6-1ad390a66052
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

{"handle":"qa-b0ff8cab2275","displayName":"QA b0ff8cab2275","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-b0ff8cab2275
correlation: qa-ff412cc1-cbe9-48ea-93a6-cc859b8ace34

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff412cc1-cbe9-48ea-93a6-cc859b8ace34
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff412cc1-cbe9-48ea-93a6-cc859b8ace34
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

{"handle":"qa-b0ff8cab2275","displayName":"QA b0ff8cab2275","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-b0ff8cab2275
correlation: qa-1b6fcbce-055f-419a-848b-f196d2cdd705

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b6fcbce-055f-419a-848b-f196d2cdd705
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b6fcbce-055f-419a-848b-f196d2cdd705
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

{"handle":"qa-b0ff8cab2275","displayName":"QA b0ff8cab2275","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-2cf33f81-960f-4d0d-92bc-650a8d90c86c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cf33f81-960f-4d0d-92bc-650a8d90c86c
Content-Type: application/json

--- request body ---
{"handle":"qa-b0ff8cab2275","password":"****"}

--- response: 200 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cf33f81-960f-4d0d-92bc-650a8d90c86c
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_687177b1-3be6-40d0-9e38-21383b2720e3"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4630446c-32bd-439d-bdc1-66018bdf02a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4630446c-32bd-439d-bdc1-66018bdf02a6
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4630446c-32bd-439d-bdc1-66018bdf02a6
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
correlation: qa-a71f7686-0e65-4f13-8233-bfd35147f7b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a71f7686-0e65-4f13-8233-bfd35147f7b0
Content-Type: application/json

--- request body ---
{"handle":"qa-b0ff8cab2275","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a71f7686-0e65-4f13-8233-bfd35147f7b0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a71f7686-0e65-4f13-8233-bfd35147f7b0"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-21f9c3c4-7c9b-4376-9a6c-6a9730d3caff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21f9c3c4-7c9b-4376-9a6c-6a9730d3caff
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-21f9c3c4-7c9b-4376-9a6c-6a9730d3caff
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
correlation: qa-09535093-f1cb-410f-87d1-45339f78272d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09535093-f1cb-410f-87d1-45339f78272d
Content-Type: application/json

--- request body ---
{"handle":"qa-4a44f849ceda","password":"****"}

--- response: 401 in 6 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09535093-f1cb-410f-87d1-45339f78272d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-09535093-f1cb-410f-87d1-45339f78272d"}
```
