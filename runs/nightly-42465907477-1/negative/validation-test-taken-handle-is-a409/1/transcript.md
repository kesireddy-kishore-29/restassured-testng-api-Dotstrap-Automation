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
| 1 | `POST /v1/accounts` | 201 | 322 | `qa-9be795ac-1199-4c42-b394-8dbf092e84ed` |
| 2 | `POST /v1/accounts` | 409 | 15 | `qa-51044cc3-ee53-4916-9121-dcb650cdb592` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-2e951e5a-5942-4b9b-ae34-7f690899a405` |
| 4 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-015d959d-ee2b-4203-8cb7-66b485fe99eb` |
| 5 | `POST /v1/auth/token` | 401 | 11 | `qa-861e029d-488d-4405-98cd-5b6391c072e6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9be795ac-1199-4c42-b394-8dbf092e84ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9be795ac-1199-4c42-b394-8dbf092e84ed
Content-Type: application/json

--- request body ---
{"handle":"qa-c94d6b8e9133","displayName":"QA c94d6b8e9133","password":"****","region":"eu"}

--- response: 201 in 322 ms ---
Date: Sun, 08 Nov 2026 09:09:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-9be795ac-1199-4c42-b394-8dbf092e84ed
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
Location: /v1/accounts/qa-c94d6b8e9133
X-Served-Region: eu
Content-Length: 181

{"id":"acc_92e826b5-e7e1-4c06-a1ad-21003d37c803","handle":"qa-c94d6b8e9133","displayName":"QA c94d6b8e9133","region":"eu","role":"user","createdAt":"2026-11-08T09:09:05.797575165Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-51044cc3-ee53-4916-9121-dcb650cdb592

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51044cc3-ee53-4916-9121-dcb650cdb592
Content-Type: application/json

--- request body ---
{"handle":"qa-c94d6b8e9133","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 15 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51044cc3-ee53-4916-9121-dcb650cdb592
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-c94d6b8e9133' is in use.","instance":"/v1/accounts","correlationId":"qa-51044cc3-ee53-4916-9121-dcb650cdb592"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2e951e5a-5942-4b9b-ae34-7f690899a405

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e951e5a-5942-4b9b-ae34-7f690899a405
Content-Type: application/json

--- request body ---
{"handle":"qa-c94d6b8e9133","password":"****"}

--- response: 200 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e951e5a-5942-4b9b-ae34-7f690899a405
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_92e826b5-e7e1-4c06-a1ad-21003d37c803"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-015d959d-ee2b-4203-8cb7-66b485fe99eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-015d959d-ee2b-4203-8cb7-66b485fe99eb
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-015d959d-ee2b-4203-8cb7-66b485fe99eb
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
correlation: qa-861e029d-488d-4405-98cd-5b6391c072e6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-861e029d-488d-4405-98cd-5b6391c072e6
Content-Type: application/json

--- request body ---
{"handle":"qa-c94d6b8e9133","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-861e029d-488d-4405-98cd-5b6391c072e6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-861e029d-488d-4405-98cd-5b6391c072e6"}
```
