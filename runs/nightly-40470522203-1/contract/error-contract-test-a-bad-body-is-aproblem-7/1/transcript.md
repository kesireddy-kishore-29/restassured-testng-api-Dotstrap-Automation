# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[7]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 59 | `qa-e6e9a149-04f8-4be8-b678-6b69cdfd8743` |
| 2 | `POST /v1/accounts` | 201 | 51 | `qa-86ac52e9-e225-4e5a-a133-a74e5a47d2f0` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-21f29d70-14d7-4317-836f-2c4dff4ccdbd` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-984f5620-2717-4244-b81e-b26126142eac` |
| 5 | `PATCH /v1/accounts/me` | 415 | 16 | `qa-83ad9eff-35d0-46da-959f-f81c790bcca1` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-f27326f9-0144-4f03-819d-378dfa6b6ce6` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-896b622d-6001-4959-b178-77f6e04d7cd3` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-30089919-4775-4d99-823f-bc50d042946a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-15f66b62-65b6-4835-88ef-e487845c8417` |
| 10 | `POST /v1/auth/token` | 401 | 20 | `qa-28711d5c-1e9c-449e-8879-812b7f8d48ed` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e6e9a149-04f8-4be8-b678-6b69cdfd8743

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6e9a149-04f8-4be8-b678-6b69cdfd8743
Content-Type: application/json

--- request body ---
{"handle":"qa-c4d1f5c0b0b9","displayName":"QA c4d1f5c0b0b9","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6e9a149-04f8-4be8-b678-6b69cdfd8743
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 466
RateLimit-Reset: 8
Location: /v1/accounts/qa-c4d1f5c0b0b9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8d679e17-66a6-45a5-8163-f802bcf6e5f4","handle":"qa-c4d1f5c0b0b9","displayName":"QA c4d1f5c0b0b9","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.216907348Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-86ac52e9-e225-4e5a-a133-a74e5a47d2f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86ac52e9-e225-4e5a-a133-a74e5a47d2f0
Content-Type: application/json

--- request body ---
{"handle":"qa-aeb6b1b93744","displayName":"QA aeb6b1b93744","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-86ac52e9-e225-4e5a-a133-a74e5a47d2f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 7
Location: /v1/accounts/qa-aeb6b1b93744
X-Served-Region: eu
Content-Length: 181

{"id":"acc_baee5cf1-cf8b-45ec-8ff9-bb033698d5e7","handle":"qa-aeb6b1b93744","displayName":"QA aeb6b1b93744","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.274863829Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-21f29d70-14d7-4317-836f-2c4dff4ccdbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21f29d70-14d7-4317-836f-2c4dff4ccdbd
Content-Type: application/json

--- request body ---
{"handle":"qa-c4d1f5c0b0b9","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-21f29d70-14d7-4317-836f-2c4dff4ccdbd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8d679e17-66a6-45a5-8163-f802bcf6e5f4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-984f5620-2717-4244-b81e-b26126142eac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-984f5620-2717-4244-b81e-b26126142eac
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-aeb6b1b93744","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-984f5620-2717-4244-b81e-b26126142eac
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
Location: /v1/conversations/cnv_d3ba763c-a3f2-474f-9fca-f3b1cec74638
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d3ba763c-a3f2-474f-9fca-f3b1cec74638","subject":"Error contract","status":"open","region":"eu","participants":["qa-c4d1f5c0b0b9","qa-aeb6b1b93744"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.380874529Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-83ad9eff-35d0-46da-959f-f81c790bcca1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83ad9eff-35d0-46da-959f-f81c790bcca1
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83ad9eff-35d0-46da-959f-f81c790bcca1
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
Content-Length: 255

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts/me","correlationId":"qa-83ad9eff-35d0-46da-959f-f81c790bcca1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f27326f9-0144-4f03-819d-378dfa6b6ce6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f27326f9-0144-4f03-819d-378dfa6b6ce6
Content-Type: application/json

--- request body ---
{"handle":"qa-aeb6b1b93744","password":"****"}

--- response: 200 in 35 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-f27326f9-0144-4f03-819d-378dfa6b6ce6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_baee5cf1-cf8b-45ec-8ff9-bb033698d5e7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-896b622d-6001-4959-b178-77f6e04d7cd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-896b622d-6001-4959-b178-77f6e04d7cd3
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-896b622d-6001-4959-b178-77f6e04d7cd3
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
correlation: qa-30089919-4775-4d99-823f-bc50d042946a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30089919-4775-4d99-823f-bc50d042946a
Content-Type: application/json

--- request body ---
{"handle":"qa-aeb6b1b93744","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-30089919-4775-4d99-823f-bc50d042946a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 420
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-30089919-4775-4d99-823f-bc50d042946a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-15f66b62-65b6-4835-88ef-e487845c8417

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15f66b62-65b6-4835-88ef-e487845c8417
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-15f66b62-65b6-4835-88ef-e487845c8417
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
correlation: qa-28711d5c-1e9c-449e-8879-812b7f8d48ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28711d5c-1e9c-449e-8879-812b7f8d48ed
Content-Type: application/json

--- request body ---
{"handle":"qa-c4d1f5c0b0b9","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-28711d5c-1e9c-449e-8879-812b7f8d48ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 414
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-28711d5c-1e9c-449e-8879-812b7f8d48ed"}
```
