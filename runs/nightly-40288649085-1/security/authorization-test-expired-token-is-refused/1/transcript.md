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
| 1 | `POST /v1/accounts` | 201 | 401 | `qa-25a700d1-f1db-41ff-aacb-889fcd6739ef` |
| 2 | `POST /v1/auth/token` | 200 | 55 | `qa-9046fc60-8cdc-466a-848d-0e0456e01e36` |
| 3 | `GET /v1/accounts/me` | 200 | 21 | `qa-0b1bbfc6-a327-491b-b8fe-64f3dc40aa17` |
| 4 | `GET /v1/accounts/me` | 200 | 17 | `qa-9427e413-45db-409e-a7ab-5a9c77537c02` |
| 5 | `GET /v1/accounts/me` | 200 | 8 | `qa-bc8b9113-725d-4f5b-bc43-b695f371d9b3` |
| 6 | `GET /v1/accounts/me` | 401 | 12 | `qa-cb1d3d5e-6e88-4c71-88af-8fd2c353d994` |
| 7 | `GET /v1/accounts/me` | 401 | 5 | `qa-9377a3d4-df67-469b-9659-398a1b0a5d78` |
| 8 | `POST /v1/auth/token` | 200 | 8 | `qa-8717ec6b-94ef-479a-b9c6-528360a26a84` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-cc90c6ef-4296-471a-86d3-49d430feb8c9` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-629049d9-5978-4b46-8aa5-40cc1448b394` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-25a700d1-f1db-41ff-aacb-889fcd6739ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25a700d1-f1db-41ff-aacb-889fcd6739ef
Content-Type: application/json

--- request body ---
{"handle":"qa-6fafb23dce77","displayName":"QA 6fafb23dce77","password":"****","region":"eu"}

--- response: 201 in 401 ms ---
Date: Mon, 26 Oct 2026 07:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-25a700d1-f1db-41ff-aacb-889fcd6739ef
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
Location: /v1/accounts/qa-6fafb23dce77
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b7080bfd-0e69-4dad-a322-673b79e4e05b","handle":"qa-6fafb23dce77","displayName":"QA 6fafb23dce77","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.424753569Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9046fc60-8cdc-466a-848d-0e0456e01e36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9046fc60-8cdc-466a-848d-0e0456e01e36
Content-Type: application/json

--- request body ---
{"handle":"qa-6fafb23dce77","password":"****","ttlSeconds":1}

--- response: 200 in 55 ms ---
Date: Mon, 26 Oct 2026 07:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-9046fc60-8cdc-466a-848d-0e0456e01e36
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_b7080bfd-0e69-4dad-a322-673b79e4e05b"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-0b1bbfc6-a327-491b-b8fe-64f3dc40aa17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b1bbfc6-a327-491b-b8fe-64f3dc40aa17
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b1bbfc6-a327-491b-b8fe-64f3dc40aa17
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

{"id":"acc_b7080bfd-0e69-4dad-a322-673b79e4e05b","handle":"qa-6fafb23dce77","displayName":"QA 6fafb23dce77","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.424753569Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-9427e413-45db-409e-a7ab-5a9c77537c02

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9427e413-45db-409e-a7ab-5a9c77537c02
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-9427e413-45db-409e-a7ab-5a9c77537c02
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

{"id":"acc_b7080bfd-0e69-4dad-a322-673b79e4e05b","handle":"qa-6fafb23dce77","displayName":"QA 6fafb23dce77","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.424753569Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc8b9113-725d-4f5b-bc43-b695f371d9b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc8b9113-725d-4f5b-bc43-b695f371d9b3
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc8b9113-725d-4f5b-bc43-b695f371d9b3
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

{"id":"acc_b7080bfd-0e69-4dad-a322-673b79e4e05b","handle":"qa-6fafb23dce77","displayName":"QA 6fafb23dce77","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.424753569Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-cb1d3d5e-6e88-4c71-88af-8fd2c353d994

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb1d3d5e-6e88-4c71-88af-8fd2c353d994
Content-Type: application/json

--- response: 401 in 12 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cb1d3d5e-6e88-4c71-88af-8fd2c353d994
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-cb1d3d5e-6e88-4c71-88af-8fd2c353d994"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-9377a3d4-df67-469b-9659-398a1b0a5d78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9377a3d4-df67-469b-9659-398a1b0a5d78
Content-Type: application/json

--- response: 401 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9377a3d4-df67-469b-9659-398a1b0a5d78
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-9377a3d4-df67-469b-9659-398a1b0a5d78"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-8717ec6b-94ef-479a-b9c6-528360a26a84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8717ec6b-94ef-479a-b9c6-528360a26a84
Content-Type: application/json

--- request body ---
{"handle":"qa-6fafb23dce77","password":"****"}

--- response: 200 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-8717ec6b-94ef-479a-b9c6-528360a26a84
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b7080bfd-0e69-4dad-a322-673b79e4e05b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cc90c6ef-4296-471a-86d3-49d430feb8c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc90c6ef-4296-471a-86d3-49d430feb8c9
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cc90c6ef-4296-471a-86d3-49d430feb8c9
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
correlation: qa-629049d9-5978-4b46-8aa5-40cc1448b394

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-629049d9-5978-4b46-8aa5-40cc1448b394
Content-Type: application/json

--- request body ---
{"handle":"qa-6fafb23dce77","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-629049d9-5978-4b46-8aa5-40cc1448b394
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-629049d9-5978-4b46-8aa5-40cc1448b394"}
```
