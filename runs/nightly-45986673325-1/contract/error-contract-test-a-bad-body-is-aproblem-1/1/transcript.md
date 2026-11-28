# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 42 | `qa-e14eddb1-981a-4723-bb8d-7fea5700c5f6` |
| 2 | `POST /v1/accounts` | 201 | 59 | `qa-bc847f5b-3d76-4ddd-ae5f-c9fc8581b9d0` |
| 3 | `POST /v1/auth/token` | 200 | 56 | `qa-929b8936-97eb-4021-a6a3-0cad4160ac41` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-58609e11-8a8c-4502-ba9b-bd8173fa4387` |
| 5 | `POST /v1/auth/token` | 415 | 63 | `qa-778a3e2b-7c5a-43ed-aea0-3cff8933536e` |
| 6 | `POST /v1/auth/token` | 200 | 62 | `qa-43676a0a-6a9c-430f-8528-8500b5166ca8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 35 | `qa-043481f4-165f-4180-a65c-70800b73631d` |
| 8 | `POST /v1/auth/token` | 401 | 17 | `qa-098b912c-18ce-412d-bc78-0aea1fa1f77b` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-f0873d69-cedc-43d2-a204-6c2e4fc4249f` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-ee3a0da1-a249-405d-9542-6b70246d806a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e14eddb1-981a-4723-bb8d-7fea5700c5f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e14eddb1-981a-4723-bb8d-7fea5700c5f6
Content-Type: application/json

--- request body ---
{"handle":"qa-6b50dffc8a3a","displayName":"QA 6b50dffc8a3a","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-e14eddb1-981a-4723-bb8d-7fea5700c5f6
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
Location: /v1/accounts/qa-6b50dffc8a3a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_55983cf8-e602-4d8b-86ae-fadac83d8103","handle":"qa-6b50dffc8a3a","displayName":"QA 6b50dffc8a3a","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.999523080Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bc847f5b-3d76-4ddd-ae5f-c9fc8581b9d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc847f5b-3d76-4ddd-ae5f-c9fc8581b9d0
Content-Type: application/json

--- request body ---
{"handle":"qa-c4214f3976fb","displayName":"QA c4214f3976fb","password":"****","region":"eu"}

--- response: 201 in 59 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc847f5b-3d76-4ddd-ae5f-c9fc8581b9d0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Location: /v1/accounts/qa-c4214f3976fb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_395370f9-7c3d-45b5-bcf8-143c9fa97e84","handle":"qa-c4214f3976fb","displayName":"QA c4214f3976fb","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.069667977Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-929b8936-97eb-4021-a6a3-0cad4160ac41

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-929b8936-97eb-4021-a6a3-0cad4160ac41
Content-Type: application/json

--- request body ---
{"handle":"qa-6b50dffc8a3a","password":"****"}

--- response: 200 in 56 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-929b8936-97eb-4021-a6a3-0cad4160ac41
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 548
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_55983cf8-e602-4d8b-86ae-fadac83d8103"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-58609e11-8a8c-4502-ba9b-bd8173fa4387

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58609e11-8a8c-4502-ba9b-bd8173fa4387
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c4214f3976fb","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-58609e11-8a8c-4502-ba9b-bd8173fa4387
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
Location: /v1/conversations/cnv_3932cfe4-8642-441c-a3e4-1bb2eb84a051
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3932cfe4-8642-441c-a3e4-1bb2eb84a051","subject":"Error contract","status":"open","region":"eu","participants":["qa-6b50dffc8a3a","qa-c4214f3976fb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:57.180061557Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-778a3e2b-7c5a-43ed-aea0-3cff8933536e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-778a3e2b-7c5a-43ed-aea0-3cff8933536e
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 63 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-778a3e2b-7c5a-43ed-aea0-3cff8933536e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 254

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/auth/token","correlationId":"qa-778a3e2b-7c5a-43ed-aea0-3cff8933536e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-43676a0a-6a9c-430f-8528-8500b5166ca8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43676a0a-6a9c-430f-8528-8500b5166ca8
Content-Type: application/json

--- request body ---
{"handle":"qa-c4214f3976fb","password":"****"}

--- response: 200 in 62 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-43676a0a-6a9c-430f-8528-8500b5166ca8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 520
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_395370f9-7c3d-45b5-bcf8-143c9fa97e84"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-043481f4-165f-4180-a65c-70800b73631d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-043481f4-165f-4180-a65c-70800b73631d
Content-Type: application/json

--- response: 204 in 35 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-043481f4-165f-4180-a65c-70800b73631d
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
correlation: qa-098b912c-18ce-412d-bc78-0aea1fa1f77b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-098b912c-18ce-412d-bc78-0aea1fa1f77b
Content-Type: application/json

--- request body ---
{"handle":"qa-c4214f3976fb","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-098b912c-18ce-412d-bc78-0aea1fa1f77b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-098b912c-18ce-412d-bc78-0aea1fa1f77b"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f0873d69-cedc-43d2-a204-6c2e4fc4249f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0873d69-cedc-43d2-a204-6c2e4fc4249f
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f0873d69-cedc-43d2-a204-6c2e4fc4249f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ee3a0da1-a249-405d-9542-6b70246d806a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee3a0da1-a249-405d-9542-6b70246d806a
Content-Type: application/json

--- request body ---
{"handle":"qa-6b50dffc8a3a","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee3a0da1-a249-405d-9542-6b70246d806a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 492
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ee3a0da1-a249-405d-9542-6b70246d806a"}
```
