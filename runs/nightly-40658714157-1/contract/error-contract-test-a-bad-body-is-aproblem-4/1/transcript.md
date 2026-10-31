# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 28 | `qa-dd41a88a-fc6f-4521-8da7-ff78475fd96a` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-12a1ffeb-6d2c-4149-af8e-ceb4e8375aea` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-893a8064-bb05-4f0e-bf81-bb3041d44616` |
| 4 | `POST /v1/conversations` | 201 | 27 | `qa-8bbba8f7-507e-4178-802a-b5dbaae03d8b` |
| 5 | `POST /v1/accounts` | 415 | 5 | `qa-31845f43-6efb-432b-baab-ddbdcbcbfdc5` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-c122d38f-1c5c-4691-8436-783d55bdb5e3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-0ddefad1-4e9b-4c1c-93f5-1f25d95c0f91` |
| 8 | `POST /v1/auth/token` | 401 | 10 | `qa-ce3b2279-b307-4c2d-89f7-146baed069f8` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-a361c5b3-f67b-4624-8952-318b82b9ed56` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-034253e8-2bab-4ba5-a2e7-1402d459bc25` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dd41a88a-fc6f-4521-8da7-ff78475fd96a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd41a88a-fc6f-4521-8da7-ff78475fd96a
Content-Type: application/json

--- request body ---
{"handle":"qa-9bd7c518ae5f","displayName":"QA 9bd7c518ae5f","password":"****","region":"eu"}

--- response: 201 in 28 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-dd41a88a-fc6f-4521-8da7-ff78475fd96a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 9
Location: /v1/accounts/qa-9bd7c518ae5f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4b763a58-e756-491b-a9d5-48b87e967f44","handle":"qa-9bd7c518ae5f","displayName":"QA 9bd7c518ae5f","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.333715962Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-12a1ffeb-6d2c-4149-af8e-ceb4e8375aea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12a1ffeb-6d2c-4149-af8e-ceb4e8375aea
Content-Type: application/json

--- request body ---
{"handle":"qa-439893698b9c","displayName":"QA 439893698b9c","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-12a1ffeb-6d2c-4149-af8e-ceb4e8375aea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 467
RateLimit-Reset: 9
Location: /v1/accounts/qa-439893698b9c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c23401cc-1e86-49fc-af2a-8ba32cd4f23a","handle":"qa-439893698b9c","displayName":"QA 439893698b9c","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.368573459Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-893a8064-bb05-4f0e-bf81-bb3041d44616

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-893a8064-bb05-4f0e-bf81-bb3041d44616
Content-Type: application/json

--- request body ---
{"handle":"qa-9bd7c518ae5f","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-893a8064-bb05-4f0e-bf81-bb3041d44616
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4b763a58-e756-491b-a9d5-48b87e967f44"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-8bbba8f7-507e-4178-802a-b5dbaae03d8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bbba8f7-507e-4178-802a-b5dbaae03d8b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-439893698b9c","subject":"Error contract","message":"Hi"}

--- response: 201 in 27 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bbba8f7-507e-4178-802a-b5dbaae03d8b
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
Location: /v1/conversations/cnv_df17f46d-6aa9-412e-8673-8fc30f3c80f1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_df17f46d-6aa9-412e-8673-8fc30f3c80f1","subject":"Error contract","status":"open","region":"eu","participants":["qa-9bd7c518ae5f","qa-439893698b9c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:52.460638096Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-31845f43-6efb-432b-baab-ddbdcbcbfdc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31845f43-6efb-432b-baab-ddbdcbcbfdc5
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-31845f43-6efb-432b-baab-ddbdcbcbfdc5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 9
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-31845f43-6efb-432b-baab-ddbdcbcbfdc5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-c122d38f-1c5c-4691-8436-783d55bdb5e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c122d38f-1c5c-4691-8436-783d55bdb5e3
Content-Type: application/json

--- request body ---
{"handle":"qa-439893698b9c","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c122d38f-1c5c-4691-8436-783d55bdb5e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 438
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c23401cc-1e86-49fc-af2a-8ba32cd4f23a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0ddefad1-4e9b-4c1c-93f5-1f25d95c0f91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ddefad1-4e9b-4c1c-93f5-1f25d95c0f91
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0ddefad1-4e9b-4c1c-93f5-1f25d95c0f91
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
correlation: qa-ce3b2279-b307-4c2d-89f7-146baed069f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce3b2279-b307-4c2d-89f7-146baed069f8
Content-Type: application/json

--- request body ---
{"handle":"qa-439893698b9c","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce3b2279-b307-4c2d-89f7-146baed069f8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ce3b2279-b307-4c2d-89f7-146baed069f8"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a361c5b3-f67b-4624-8952-318b82b9ed56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a361c5b3-f67b-4624-8952-318b82b9ed56
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a361c5b3-f67b-4624-8952-318b82b9ed56
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-034253e8-2bab-4ba5-a2e7-1402d459bc25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-034253e8-2bab-4ba5-a2e7-1402d459bc25
Content-Type: application/json

--- request body ---
{"handle":"qa-9bd7c518ae5f","password":"****"}

--- response: 401 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-034253e8-2bab-4ba5-a2e7-1402d459bc25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-034253e8-2bab-4ba5-a2e7-1402d459bc25"}
```
