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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-8ff2c736-9b94-4929-b856-c35aa00814cf` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-56965d46-d149-4389-9972-2a3a521313dc` |
| 3 | `POST /v1/auth/token` | 200 | 21 | `qa-48c8d333-1ea2-43b1-b500-83bdecc6ed2e` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 15 | `qa-7fdfd64d-932f-429a-9fba-d62de7152039` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 13 | `qa-50e8f982-e93c-4669-9a07-783a1bbb32a3` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 14 | `qa-12ea0c96-cf6b-4627-a11c-56c07221f635` |
| 7 | `POST /v1/auth/token` | 200 | 53 | `qa-6f197c91-8e3f-4c61-aedd-a309e812aebf` |
| 8 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-433b5d67-dda3-48ad-b63d-ac01d26c79f6` |
| 9 | `POST /v1/auth/token` | 401 | 13 | `qa-a5f7752a-ab5c-408e-b3e9-ff30fcf11dc0` |
| 10 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-7a9d60c3-6b10-4c4b-9918-7d02fecbffaf` |
| 11 | `POST /v1/auth/token` | 401 | 30 | `qa-a9975e62-2b58-4626-80ec-7a5c7563d92c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8ff2c736-9b94-4929-b856-c35aa00814cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ff2c736-9b94-4929-b856-c35aa00814cf
Content-Type: application/json

--- request body ---
{"handle":"qa-6962e09c68d8","displayName":"QA 6962e09c68d8","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-8ff2c736-9b94-4929-b856-c35aa00814cf
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
Location: /v1/accounts/qa-6962e09c68d8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_30ee6824-62b5-47ac-aaf5-c2a4499fe1e9","handle":"qa-6962e09c68d8","displayName":"QA 6962e09c68d8","region":"eu","role":"user","createdAt":"2026-11-18T10:19:53.074559747Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-56965d46-d149-4389-9972-2a3a521313dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56965d46-d149-4389-9972-2a3a521313dc
Content-Type: application/json

--- request body ---
{"handle":"qa-f3b41a345e78","displayName":"QA f3b41a345e78","password":"****","region":"us"}

--- response: 201 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-56965d46-d149-4389-9972-2a3a521313dc
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
Location: /v1/accounts/qa-f3b41a345e78
X-Served-Region: us
Content-Length: 181

{"id":"acc_431bdc4c-15d5-4f49-b2aa-316dc9be9ed4","handle":"qa-f3b41a345e78","displayName":"QA f3b41a345e78","region":"us","role":"user","createdAt":"2026-11-18T10:19:53.099694941Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-48c8d333-1ea2-43b1-b500-83bdecc6ed2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48c8d333-1ea2-43b1-b500-83bdecc6ed2e
Content-Type: application/json

--- request body ---
{"handle":"qa-6962e09c68d8","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-48c8d333-1ea2-43b1-b500-83bdecc6ed2e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_30ee6824-62b5-47ac-aaf5-c2a4499fe1e9"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-f3b41a345e78
correlation: qa-7fdfd64d-932f-429a-9fba-d62de7152039

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fdfd64d-932f-429a-9fba-d62de7152039
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-7fdfd64d-932f-429a-9fba-d62de7152039
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

{"handle":"qa-f3b41a345e78","displayName":"QA f3b41a345e78","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-f3b41a345e78
correlation: qa-50e8f982-e93c-4669-9a07-783a1bbb32a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50e8f982-e93c-4669-9a07-783a1bbb32a3
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-50e8f982-e93c-4669-9a07-783a1bbb32a3
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

{"handle":"qa-f3b41a345e78","displayName":"QA f3b41a345e78","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-f3b41a345e78
correlation: qa-12ea0c96-cf6b-4627-a11c-56c07221f635

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12ea0c96-cf6b-4627-a11c-56c07221f635
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-12ea0c96-cf6b-4627-a11c-56c07221f635
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

{"handle":"qa-f3b41a345e78","displayName":"QA f3b41a345e78","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-6f197c91-8e3f-4c61-aedd-a309e812aebf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f197c91-8e3f-4c61-aedd-a309e812aebf
Content-Type: application/json

--- request body ---
{"handle":"qa-f3b41a345e78","password":"****"}

--- response: 200 in 53 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f197c91-8e3f-4c61-aedd-a309e812aebf
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_431bdc4c-15d5-4f49-b2aa-316dc9be9ed4"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-433b5d67-dda3-48ad-b63d-ac01d26c79f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-433b5d67-dda3-48ad-b63d-ac01d26c79f6
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-433b5d67-dda3-48ad-b63d-ac01d26c79f6
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
correlation: qa-a5f7752a-ab5c-408e-b3e9-ff30fcf11dc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5f7752a-ab5c-408e-b3e9-ff30fcf11dc0
Content-Type: application/json

--- request body ---
{"handle":"qa-f3b41a345e78","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5f7752a-ab5c-408e-b3e9-ff30fcf11dc0
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a5f7752a-ab5c-408e-b3e9-ff30fcf11dc0"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7a9d60c3-6b10-4c4b-9918-7d02fecbffaf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a9d60c3-6b10-4c4b-9918-7d02fecbffaf
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7a9d60c3-6b10-4c4b-9918-7d02fecbffaf
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
correlation: qa-a9975e62-2b58-4626-80ec-7a5c7563d92c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9975e62-2b58-4626-80ec-7a5c7563d92c
Content-Type: application/json

--- request body ---
{"handle":"qa-6962e09c68d8","password":"****"}

--- response: 401 in 30 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9975e62-2b58-4626-80ec-7a5c7563d92c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a9975e62-2b58-4626-80ec-7a5c7563d92c"}
```
