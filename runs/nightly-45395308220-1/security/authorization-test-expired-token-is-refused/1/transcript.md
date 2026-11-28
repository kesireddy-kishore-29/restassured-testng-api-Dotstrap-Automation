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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-32b8e69c-5464-4845-ae0b-fe72f435787b` |
| 2 | `POST /v1/auth/token` | 200 | 28 | `qa-2e39a0b3-b644-47fe-b89f-ed6f2879f7b3` |
| 3 | `GET /v1/accounts/me` | 200 | 13 | `qa-46293e9f-49ec-4a97-9317-9d143d79a604` |
| 4 | `GET /v1/accounts/me` | 200 | 9 | `qa-2403c4a2-e0d3-4861-9a89-9baaa89412d1` |
| 5 | `GET /v1/accounts/me` | 200 | 8 | `qa-90075c6e-faba-4f55-9e1e-6c86f44447c3` |
| 6 | `GET /v1/accounts/me` | 401 | 6 | `qa-64b6533d-6308-4e61-9d0b-5feb20a8a705` |
| 7 | `GET /v1/accounts/me` | 401 | 5 | `qa-2982ac5a-613b-4522-b47f-eefdafb719fe` |
| 8 | `POST /v1/auth/token` | 200 | 10 | `qa-77ce897b-e133-47eb-973f-70554da0bdda` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-a072998d-e99c-49a2-bd9f-b177408e5c78` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-775e3ae3-a5e6-496d-99e5-aa97c1b741e5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-32b8e69c-5464-4845-ae0b-fe72f435787b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32b8e69c-5464-4845-ae0b-fe72f435787b
Content-Type: application/json

--- request body ---
{"handle":"qa-aadd50458746","displayName":"QA aadd50458746","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-32b8e69c-5464-4845-ae0b-fe72f435787b
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
Location: /v1/accounts/qa-aadd50458746
X-Served-Region: eu
Content-Length: 181

{"id":"acc_503d5e2d-89e9-46fc-b353-68e1318fae23","handle":"qa-aadd50458746","displayName":"QA aadd50458746","region":"eu","role":"user","createdAt":"2026-11-24T12:38:07.159585415Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-2e39a0b3-b644-47fe-b89f-ed6f2879f7b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e39a0b3-b644-47fe-b89f-ed6f2879f7b3
Content-Type: application/json

--- request body ---
{"handle":"qa-aadd50458746","password":"****","ttlSeconds":1}

--- response: 200 in 28 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e39a0b3-b644-47fe-b89f-ed6f2879f7b3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_503d5e2d-89e9-46fc-b353-68e1318fae23"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-46293e9f-49ec-4a97-9317-9d143d79a604

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46293e9f-49ec-4a97-9317-9d143d79a604
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-46293e9f-49ec-4a97-9317-9d143d79a604
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

{"id":"acc_503d5e2d-89e9-46fc-b353-68e1318fae23","handle":"qa-aadd50458746","displayName":"QA aadd50458746","region":"eu","role":"user","createdAt":"2026-11-24T12:38:07.159585415Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-2403c4a2-e0d3-4861-9a89-9baaa89412d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2403c4a2-e0d3-4861-9a89-9baaa89412d1
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-2403c4a2-e0d3-4861-9a89-9baaa89412d1
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

{"id":"acc_503d5e2d-89e9-46fc-b353-68e1318fae23","handle":"qa-aadd50458746","displayName":"QA aadd50458746","region":"eu","role":"user","createdAt":"2026-11-24T12:38:07.159585415Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-90075c6e-faba-4f55-9e1e-6c86f44447c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90075c6e-faba-4f55-9e1e-6c86f44447c3
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-90075c6e-faba-4f55-9e1e-6c86f44447c3
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

{"id":"acc_503d5e2d-89e9-46fc-b353-68e1318fae23","handle":"qa-aadd50458746","displayName":"QA aadd50458746","region":"eu","role":"user","createdAt":"2026-11-24T12:38:07.159585415Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-64b6533d-6308-4e61-9d0b-5feb20a8a705

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64b6533d-6308-4e61-9d0b-5feb20a8a705
Content-Type: application/json

--- response: 401 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-64b6533d-6308-4e61-9d0b-5feb20a8a705
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-64b6533d-6308-4e61-9d0b-5feb20a8a705"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-2982ac5a-613b-4522-b47f-eefdafb719fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2982ac5a-613b-4522-b47f-eefdafb719fe
Content-Type: application/json

--- response: 401 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2982ac5a-613b-4522-b47f-eefdafb719fe
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-2982ac5a-613b-4522-b47f-eefdafb719fe"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-77ce897b-e133-47eb-973f-70554da0bdda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77ce897b-e133-47eb-973f-70554da0bdda
Content-Type: application/json

--- request body ---
{"handle":"qa-aadd50458746","password":"****"}

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-77ce897b-e133-47eb-973f-70554da0bdda
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_503d5e2d-89e9-46fc-b353-68e1318fae23"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a072998d-e99c-49a2-bd9f-b177408e5c78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a072998d-e99c-49a2-bd9f-b177408e5c78
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a072998d-e99c-49a2-bd9f-b177408e5c78
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
correlation: qa-775e3ae3-a5e6-496d-99e5-aa97c1b741e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-775e3ae3-a5e6-496d-99e5-aa97c1b741e5
Content-Type: application/json

--- request body ---
{"handle":"qa-aadd50458746","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-775e3ae3-a5e6-496d-99e5-aa97c1b741e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-775e3ae3-a5e6-496d-99e5-aa97c1b741e5"}
```
