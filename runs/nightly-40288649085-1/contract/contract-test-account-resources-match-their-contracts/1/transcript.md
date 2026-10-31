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
| 1 | `POST /v1/accounts` | 201 | 418 | `qa-c2ede568-8db2-47fe-b3be-15346a6bb864` |
| 2 | `POST /v1/accounts` | 201 | 128 | `qa-08213604-b479-404c-86b7-15883a18c656` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-1cee5fe9-1932-44d5-b299-69cea4cbc047` |
| 4 | `POST /v1/auth/token` | 200 | 38 | `qa-a963d040-f455-498d-98b5-255e7ee8de68` |
| 5 | `GET /v1/accounts/me` | 200 | 25 | `qa-54189578-0ffd-4b48-8c12-c8bb34439961` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 34 | `qa-2475f7cd-6a96-41ec-9227-88355eff4b41` |
| 7 | `POST /v1/auth/token` | 200 | 17 | `qa-cc27336e-4985-4433-983b-a82055e87b80` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-cf02abdd-34ad-4a46-b529-cabf37d61c60` |
| 9 | `POST /v1/auth/token` | 401 | 13 | `qa-67506d4b-ff87-4228-8820-171d5a164442` |
| 10 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-c4ce9e72-1cc8-4d13-89fa-bd54aeb8ba7f` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-683f65bb-df33-49ce-9b69-af9ea88bd80e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c2ede568-8db2-47fe-b3be-15346a6bb864

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2ede568-8db2-47fe-b3be-15346a6bb864
Content-Type: application/json

--- request body ---
{"handle":"qa-b0f6e17279fe","displayName":"QA b0f6e17279fe","password":"****","region":"eu"}

--- response: 201 in 418 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-c2ede568-8db2-47fe-b3be-15346a6bb864
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-b0f6e17279fe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88175583-a76d-4057-ac5b-5f15c1da9fca","handle":"qa-b0f6e17279fe","displayName":"QA b0f6e17279fe","region":"eu","role":"user","createdAt":"2026-10-26T07:54:44.995334984Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-08213604-b479-404c-86b7-15883a18c656

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08213604-b479-404c-86b7-15883a18c656
Content-Type: application/json

--- request body ---
{"handle":"qa-af6df6514741","displayName":"QA af6df6514741","password":"****","region":"us"}

--- response: 201 in 128 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-08213604-b479-404c-86b7-15883a18c656
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
Location: /v1/accounts/qa-af6df6514741
X-Served-Region: us
Content-Length: 181

{"id":"acc_6689f44a-2781-410a-9084-4752052748af","handle":"qa-af6df6514741","displayName":"QA af6df6514741","region":"us","role":"user","createdAt":"2026-10-26T07:54:45.506116020Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-1cee5fe9-1932-44d5-b299-69cea4cbc047

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cee5fe9-1932-44d5-b299-69cea4cbc047
Content-Type: application/json

--- request body ---
{"handle":"qa-b0f6e17279fe","password":"****"}

--- response: 200 in 36 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cee5fe9-1932-44d5-b299-69cea4cbc047
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_88175583-a76d-4057-ac5b-5f15c1da9fca"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-a963d040-f455-498d-98b5-255e7ee8de68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a963d040-f455-498d-98b5-255e7ee8de68
Content-Type: application/json

--- request body ---
{"handle":"qa-b0f6e17279fe","password":"****"}

--- response: 200 in 38 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-a963d040-f455-498d-98b5-255e7ee8de68
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_88175583-a76d-4057-ac5b-5f15c1da9fca"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-54189578-0ffd-4b48-8c12-c8bb34439961

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54189578-0ffd-4b48-8c12-c8bb34439961
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-54189578-0ffd-4b48-8c12-c8bb34439961
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

{"id":"acc_88175583-a76d-4057-ac5b-5f15c1da9fca","handle":"qa-b0f6e17279fe","displayName":"QA b0f6e17279fe","region":"eu","role":"user","createdAt":"2026-10-26T07:54:44.995334984Z"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-af6df6514741
correlation: qa-2475f7cd-6a96-41ec-9227-88355eff4b41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2475f7cd-6a96-41ec-9227-88355eff4b41
Content-Type: application/json

--- response: 200 in 34 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-2475f7cd-6a96-41ec-9227-88355eff4b41
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

{"handle":"qa-af6df6514741","displayName":"QA af6df6514741","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-cc27336e-4985-4433-983b-a82055e87b80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc27336e-4985-4433-983b-a82055e87b80
Content-Type: application/json

--- request body ---
{"handle":"qa-af6df6514741","password":"****"}

--- response: 200 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc27336e-4985-4433-983b-a82055e87b80
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6689f44a-2781-410a-9084-4752052748af"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cf02abdd-34ad-4a46-b529-cabf37d61c60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf02abdd-34ad-4a46-b529-cabf37d61c60
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cf02abdd-34ad-4a46-b529-cabf37d61c60
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
correlation: qa-67506d4b-ff87-4228-8820-171d5a164442

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67506d4b-ff87-4228-8820-171d5a164442
Content-Type: application/json

--- request body ---
{"handle":"qa-af6df6514741","password":"****"}

--- response: 401 in 13 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67506d4b-ff87-4228-8820-171d5a164442
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67506d4b-ff87-4228-8820-171d5a164442"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c4ce9e72-1cc8-4d13-89fa-bd54aeb8ba7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4ce9e72-1cc8-4d13-89fa-bd54aeb8ba7f
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c4ce9e72-1cc8-4d13-89fa-bd54aeb8ba7f
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
correlation: qa-683f65bb-df33-49ce-9b69-af9ea88bd80e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-683f65bb-df33-49ce-9b69-af9ea88bd80e
Content-Type: application/json

--- request body ---
{"handle":"qa-b0f6e17279fe","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-683f65bb-df33-49ce-9b69-af9ea88bd80e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-683f65bb-df33-49ce-9b69-af9ea88bd80e"}
```
