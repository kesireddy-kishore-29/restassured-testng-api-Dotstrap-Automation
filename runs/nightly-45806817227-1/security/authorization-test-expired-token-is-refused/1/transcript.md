# Transcript: A token stops working when it expires

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#expiredTokenIsRefused` |
| Features | FEAT-SEC-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-b2826392-2f77-4416-9be4-e02e743521f5` |
| 2 | `POST /v1/auth/token` | 200 | 21 | `qa-9e4fec52-60dc-4fbd-8918-86f435802b5a` |
| 3 | `GET /v1/accounts/me` | 200 | 7 | `qa-ad5b9255-21c2-4c3b-861f-21ef4bceff7c` |
| 4 | `GET /v1/accounts/me` | 200 | 14 | `qa-44630b33-e526-4991-8268-394895afd739` |
| 5 | `GET /v1/accounts/me` | 200 | 5 | `qa-e0341454-fa07-44a5-a42f-ffc1c9f91c47` |
| 6 | `GET /v1/accounts/me` | 401 | 4 | `qa-a8dd1d99-b04c-4af4-a3e1-09b33f0998fb` |
| 7 | `GET /v1/accounts/me` | 401 | 7 | `qa-00cfb5e6-eded-47d9-8e32-7a805383171b` |
| 8 | `POST /v1/auth/token` | 200 | 7 | `qa-0ebfe330-61fc-4571-8545-c3c958f4c196` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-4af89eaa-9724-40f0-bcd3-47a2aa2032e6` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-66ab00f8-5970-4323-a83b-4c3be84840c4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b2826392-2f77-4416-9be4-e02e743521f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2826392-2f77-4416-9be4-e02e743521f5
Content-Type: application/json

--- request body ---
{"handle":"qa-1b6478ba7964","displayName":"QA 1b6478ba7964","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2826392-2f77-4416-9be4-e02e743521f5
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
Location: /v1/accounts/qa-1b6478ba7964
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b25b40bd-b52c-40d3-86a4-ddd9e145e493","handle":"qa-1b6478ba7964","displayName":"QA 1b6478ba7964","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.692547125Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9e4fec52-60dc-4fbd-8918-86f435802b5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e4fec52-60dc-4fbd-8918-86f435802b5a
Content-Type: application/json

--- request body ---
{"handle":"qa-1b6478ba7964","password":"****","ttlSeconds":1}

--- response: 200 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e4fec52-60dc-4fbd-8918-86f435802b5a
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
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_b25b40bd-b52c-40d3-86a4-ddd9e145e493"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ad5b9255-21c2-4c3b-861f-21ef4bceff7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad5b9255-21c2-4c3b-861f-21ef4bceff7c
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad5b9255-21c2-4c3b-861f-21ef4bceff7c
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

{"id":"acc_b25b40bd-b52c-40d3-86a4-ddd9e145e493","handle":"qa-1b6478ba7964","displayName":"QA 1b6478ba7964","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.692547125Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-44630b33-e526-4991-8268-394895afd739

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-44630b33-e526-4991-8268-394895afd739
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-44630b33-e526-4991-8268-394895afd739
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
Content-Length: 181

{"id":"acc_b25b40bd-b52c-40d3-86a4-ddd9e145e493","handle":"qa-1b6478ba7964","displayName":"QA 1b6478ba7964","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.692547125Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0341454-fa07-44a5-a42f-ffc1c9f91c47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0341454-fa07-44a5-a42f-ffc1c9f91c47
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-e0341454-fa07-44a5-a42f-ffc1c9f91c47
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
Content-Length: 181

{"id":"acc_b25b40bd-b52c-40d3-86a4-ddd9e145e493","handle":"qa-1b6478ba7964","displayName":"QA 1b6478ba7964","region":"eu","role":"user","createdAt":"2026-11-26T11:02:28.692547125Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-a8dd1d99-b04c-4af4-a3e1-09b33f0998fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8dd1d99-b04c-4af4-a3e1-09b33f0998fb
Content-Type: application/json

--- response: 401 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a8dd1d99-b04c-4af4-a3e1-09b33f0998fb
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
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-a8dd1d99-b04c-4af4-a3e1-09b33f0998fb"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-00cfb5e6-eded-47d9-8e32-7a805383171b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00cfb5e6-eded-47d9-8e32-7a805383171b
Content-Type: application/json

--- response: 401 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-00cfb5e6-eded-47d9-8e32-7a805383171b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-00cfb5e6-eded-47d9-8e32-7a805383171b"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-0ebfe330-61fc-4571-8545-c3c958f4c196

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ebfe330-61fc-4571-8545-c3c958f4c196
Content-Type: application/json

--- request body ---
{"handle":"qa-1b6478ba7964","password":"****"}

--- response: 200 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ebfe330-61fc-4571-8545-c3c958f4c196
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b25b40bd-b52c-40d3-86a4-ddd9e145e493"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4af89eaa-9724-40f0-bcd3-47a2aa2032e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4af89eaa-9724-40f0-bcd3-47a2aa2032e6
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4af89eaa-9724-40f0-bcd3-47a2aa2032e6
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-66ab00f8-5970-4323-a83b-4c3be84840c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66ab00f8-5970-4323-a83b-4c3be84840c4
Content-Type: application/json

--- request body ---
{"handle":"qa-1b6478ba7964","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-66ab00f8-5970-4323-a83b-4c3be84840c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-66ab00f8-5970-4323-a83b-4c3be84840c4"}
```
