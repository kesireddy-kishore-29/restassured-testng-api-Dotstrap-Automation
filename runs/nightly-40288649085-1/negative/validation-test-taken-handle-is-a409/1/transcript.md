# Transcript: A handle that is already taken is a 409

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#takenHandleIsA409` |
| Features | FEAT-ACCT-01, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 621 | `qa-ea9496ed-360b-44a8-9f92-1daaf613e49f` |
| 2 | `POST /v1/accounts` | 409 | 26 | `qa-22b530e7-a431-49b8-980a-1088a03d7f31` |
| 3 | `POST /v1/auth/token` | 200 | 42 | `qa-a558d6da-61db-4d7c-b920-c8c7b0aee0dc` |
| 4 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-717e4d9f-d816-4f9a-83d4-5b4c6e80e1d7` |
| 5 | `POST /v1/auth/token` | 401 | 20 | `qa-8bf2f98a-efd4-49ab-b6e3-7fc6d3ac72b1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ea9496ed-360b-44a8-9f92-1daaf613e49f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea9496ed-360b-44a8-9f92-1daaf613e49f
Content-Type: application/json

--- request body ---
{"handle":"qa-a81f517f58d7","displayName":"QA a81f517f58d7","password":"****","region":"eu"}

--- response: 201 in 621 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea9496ed-360b-44a8-9f92-1daaf613e49f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-a81f517f58d7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6f33d270-5cb1-4437-98a2-faf6812565f9","handle":"qa-a81f517f58d7","displayName":"QA a81f517f58d7","region":"eu","role":"user","createdAt":"2026-10-26T07:54:44.400587089Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-22b530e7-a431-49b8-980a-1088a03d7f31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22b530e7-a431-49b8-980a-1088a03d7f31
Content-Type: application/json

--- request body ---
{"handle":"qa-a81f517f58d7","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 26 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22b530e7-a431-49b8-980a-1088a03d7f31
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
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-a81f517f58d7' is in use.","instance":"/v1/accounts","correlationId":"qa-22b530e7-a431-49b8-980a-1088a03d7f31"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a558d6da-61db-4d7c-b920-c8c7b0aee0dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a558d6da-61db-4d7c-b920-c8c7b0aee0dc
Content-Type: application/json

--- request body ---
{"handle":"qa-a81f517f58d7","password":"****"}

--- response: 200 in 42 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-a558d6da-61db-4d7c-b920-c8c7b0aee0dc
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6f33d270-5cb1-4437-98a2-faf6812565f9"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-717e4d9f-d816-4f9a-83d4-5b4c6e80e1d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-717e4d9f-d816-4f9a-83d4-5b4c6e80e1d7
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-717e4d9f-d816-4f9a-83d4-5b4c6e80e1d7
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-8bf2f98a-efd4-49ab-b6e3-7fc6d3ac72b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bf2f98a-efd4-49ab-b6e3-7fc6d3ac72b1
Content-Type: application/json

--- request body ---
{"handle":"qa-a81f517f58d7","password":"****"}

--- response: 401 in 20 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8bf2f98a-efd4-49ab-b6e3-7fc6d3ac72b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8bf2f98a-efd4-49ab-b6e3-7fc6d3ac72b1"}
```
