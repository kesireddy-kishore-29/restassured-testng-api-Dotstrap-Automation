# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-3a986860-6b1f-4ac2-86bd-4aa83f6a0fc1` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-96418a47-4fc0-471b-9e9a-e8a3565a1082` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-98a5f315-6937-4edf-9508-a9a73600e4aa` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-1b19ee43-d8f4-474a-8c59-b59f92abd529` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 23 | `qa-e9da178a-fc99-4723-b497-09f238ce2af1` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-58fd833e-06b4-4571-9b42-9d21d7173700` |
| 7 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-39e1f9fc-0e8a-4a61-99f2-0b9ef3d490bc` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-be17a2da-be15-4145-ba64-e289fe006ce1` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-78c2d69c-0557-4c55-ab92-1bbf74db01e3` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-d008ad97-77e4-46a0-be04-eb475a37e24b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3a986860-6b1f-4ac2-86bd-4aa83f6a0fc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a986860-6b1f-4ac2-86bd-4aa83f6a0fc1
Content-Type: application/json

--- request body ---
{"handle":"qa-74f13ccf28dd","displayName":"QA 74f13ccf28dd","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a986860-6b1f-4ac2-86bd-4aa83f6a0fc1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 7
Location: /v1/accounts/qa-74f13ccf28dd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c649b731-d342-472d-9afe-214368562ca1","handle":"qa-74f13ccf28dd","displayName":"QA 74f13ccf28dd","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.308478211Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-96418a47-4fc0-471b-9e9a-e8a3565a1082

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96418a47-4fc0-471b-9e9a-e8a3565a1082
Content-Type: application/json

--- request body ---
{"handle":"qa-b8942d0874d2","displayName":"QA b8942d0874d2","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-96418a47-4fc0-471b-9e9a-e8a3565a1082
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 345
RateLimit-Reset: 7
Location: /v1/accounts/qa-b8942d0874d2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4ec3e7e4-d824-481b-80a2-7bfb2643100f","handle":"qa-b8942d0874d2","displayName":"QA b8942d0874d2","region":"eu","role":"user","createdAt":"2026-11-07T08:54:59.332317301Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-98a5f315-6937-4edf-9508-a9a73600e4aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98a5f315-6937-4edf-9508-a9a73600e4aa
Content-Type: application/json

--- request body ---
{"handle":"qa-74f13ccf28dd","password":"****"}

--- response: 200 in 43 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-98a5f315-6937-4edf-9508-a9a73600e4aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c649b731-d342-472d-9afe-214368562ca1"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1b19ee43-d8f4-474a-8c59-b59f92abd529

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b19ee43-d8f4-474a-8c59-b59f92abd529
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b8942d0874d2","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b19ee43-d8f4-474a-8c59-b59f92abd529
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
Location: /v1/conversations/cnv_8b8dda57-a000-4d39-88b7-d73b8f8804a0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8b8dda57-a000-4d39-88b7-d73b8f8804a0","subject":"Error contract","status":"open","region":"eu","participants":["qa-74f13ccf28dd","qa-b8942d0874d2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:59.397255264Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_8b8dda57-a000-4d39-88b7-d73b8f8804a0/messages
correlation: qa-e9da178a-fc99-4723-b497-09f238ce2af1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9da178a-fc99-4723-b497-09f238ce2af1
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 23 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e9da178a-fc99-4723-b497-09f238ce2af1
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_8b8dda57-a000-4d39-88b7-d73b8f8804a0/messages","correlationId":"qa-e9da178a-fc99-4723-b497-09f238ce2af1","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-58fd833e-06b4-4571-9b42-9d21d7173700

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58fd833e-06b4-4571-9b42-9d21d7173700
Content-Type: application/json

--- request body ---
{"handle":"qa-b8942d0874d2","password":"****"}

--- response: 200 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-58fd833e-06b4-4571-9b42-9d21d7173700
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4ec3e7e4-d824-481b-80a2-7bfb2643100f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-39e1f9fc-0e8a-4a61-99f2-0b9ef3d490bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39e1f9fc-0e8a-4a61-99f2-0b9ef3d490bc
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-39e1f9fc-0e8a-4a61-99f2-0b9ef3d490bc
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
correlation: qa-be17a2da-be15-4145-ba64-e289fe006ce1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be17a2da-be15-4145-ba64-e289fe006ce1
Content-Type: application/json

--- request body ---
{"handle":"qa-b8942d0874d2","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-be17a2da-be15-4145-ba64-e289fe006ce1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 316
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-be17a2da-be15-4145-ba64-e289fe006ce1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-78c2d69c-0557-4c55-ab92-1bbf74db01e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78c2d69c-0557-4c55-ab92-1bbf74db01e3
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-78c2d69c-0557-4c55-ab92-1bbf74db01e3
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
correlation: qa-d008ad97-77e4-46a0-be04-eb475a37e24b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d008ad97-77e4-46a0-be04-eb475a37e24b
Content-Type: application/json

--- request body ---
{"handle":"qa-74f13ccf28dd","password":"****"}

--- response: 401 in 19 ms ---
Date: Sat, 07 Nov 2026 08:54:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d008ad97-77e4-46a0-be04-eb475a37e24b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d008ad97-77e4-46a0-be04-eb475a37e24b"}
```
