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
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-927908d2-35c0-4d33-82b3-6a44009fb343` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-e1fd605f-f810-487a-b390-da3c83ff0816` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-52f1ca0d-5969-407c-b670-f1c0b865fd5a` |
| 4 | `POST /v1/conversations` | 201 | 35 | `qa-1b5476c3-49cb-429b-a8fa-32fd1ceb0fda` |
| 5 | `POST /v1/accounts` | 415 | 21 | `qa-13c53428-0401-41df-9ea1-dcbdd11765d6` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-22df6f7a-f0fd-400e-8f71-fee7289b6850` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-c3d87d01-5368-4523-94ce-b61485cfefce` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-cf806099-2943-49bb-97ee-65f9061ad4c0` |
| 9 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-3c250de5-28bd-44ae-89bb-c2b949fb025d` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-963a59ef-c3d0-402e-9cb2-a70c09d0db42` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-927908d2-35c0-4d33-82b3-6a44009fb343

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-927908d2-35c0-4d33-82b3-6a44009fb343
Content-Type: application/json

--- request body ---
{"handle":"qa-b53335f36b92","displayName":"QA b53335f36b92","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-927908d2-35c0-4d33-82b3-6a44009fb343
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 485
RateLimit-Reset: 8
Location: /v1/accounts/qa-b53335f36b92
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4de61308-0eba-4fdd-9002-7d7d242e1bcd","handle":"qa-b53335f36b92","displayName":"QA b53335f36b92","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.339879175Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e1fd605f-f810-487a-b390-da3c83ff0816

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1fd605f-f810-487a-b390-da3c83ff0816
Content-Type: application/json

--- request body ---
{"handle":"qa-6cca18419ab9","displayName":"QA 6cca18419ab9","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1fd605f-f810-487a-b390-da3c83ff0816
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 474
RateLimit-Reset: 8
Location: /v1/accounts/qa-6cca18419ab9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_779805ee-09d0-4641-92ef-18ac5a63e6a8","handle":"qa-6cca18419ab9","displayName":"QA 6cca18419ab9","region":"eu","role":"user","createdAt":"2026-11-14T09:05:11.391476539Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-52f1ca0d-5969-407c-b670-f1c0b865fd5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52f1ca0d-5969-407c-b670-f1c0b865fd5a
Content-Type: application/json

--- request body ---
{"handle":"qa-b53335f36b92","password":"****"}

--- response: 200 in 33 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-52f1ca0d-5969-407c-b670-f1c0b865fd5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 464
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4de61308-0eba-4fdd-9002-7d7d242e1bcd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-1b5476c3-49cb-429b-a8fa-32fd1ceb0fda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b5476c3-49cb-429b-a8fa-32fd1ceb0fda
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6cca18419ab9","subject":"Error contract","message":"Hi"}

--- response: 201 in 35 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b5476c3-49cb-429b-a8fa-32fd1ceb0fda
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
Location: /v1/conversations/cnv_7d206dd3-6753-4389-aed8-e01497376b65
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_7d206dd3-6753-4389-aed8-e01497376b65","subject":"Error contract","status":"open","region":"eu","participants":["qa-b53335f36b92","qa-6cca18419ab9"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:11.501355317Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-13c53428-0401-41df-9ea1-dcbdd11765d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13c53428-0401-41df-9ea1-dcbdd11765d6
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-13c53428-0401-41df-9ea1-dcbdd11765d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 451
RateLimit-Reset: 8
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-13c53428-0401-41df-9ea1-dcbdd11765d6"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-22df6f7a-f0fd-400e-8f71-fee7289b6850

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22df6f7a-f0fd-400e-8f71-fee7289b6850
Content-Type: application/json

--- request body ---
{"handle":"qa-6cca18419ab9","password":"****"}

--- response: 200 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-22df6f7a-f0fd-400e-8f71-fee7289b6850
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 444
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_779805ee-09d0-4641-92ef-18ac5a63e6a8"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c3d87d01-5368-4523-94ce-b61485cfefce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3d87d01-5368-4523-94ce-b61485cfefce
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c3d87d01-5368-4523-94ce-b61485cfefce
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
correlation: qa-cf806099-2943-49bb-97ee-65f9061ad4c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf806099-2943-49bb-97ee-65f9061ad4c0
Content-Type: application/json

--- request body ---
{"handle":"qa-6cca18419ab9","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf806099-2943-49bb-97ee-65f9061ad4c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cf806099-2943-49bb-97ee-65f9061ad4c0"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3c250de5-28bd-44ae-89bb-c2b949fb025d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c250de5-28bd-44ae-89bb-c2b949fb025d
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3c250de5-28bd-44ae-89bb-c2b949fb025d
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
correlation: qa-963a59ef-c3d0-402e-9cb2-a70c09d0db42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-963a59ef-c3d0-402e-9cb2-a70c09d0db42
Content-Type: application/json

--- request body ---
{"handle":"qa-b53335f36b92","password":"****"}

--- response: 401 in 11 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-963a59ef-c3d0-402e-9cb2-a70c09d0db42
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-963a59ef-c3d0-402e-9cb2-a70c09d0db42"}
```
