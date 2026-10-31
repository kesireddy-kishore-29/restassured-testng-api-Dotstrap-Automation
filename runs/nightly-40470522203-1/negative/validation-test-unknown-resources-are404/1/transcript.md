# Transcript: Unknown conversations and handles are 404 problems

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#unknownResourcesAre404` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 524 | `qa-09234655-48e7-46fb-b8da-79165e88f255` |
| 2 | `POST /v1/auth/token` | 200 | 90 | `qa-fbc360dd-81fb-4aba-8c05-3330b9ce9073` |
| 3 | `GET /v1/conversations/{id}` | 404 | 86 | `qa-3dbc8823-e272-4eb2-ae00-2dfb5514fe27` |
| 4 | `GET /v1/accounts/{handle}` | 404 | 23 | `qa-052edd2d-651b-421a-af76-4118b442fcd2` |
| 5 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-ecc8d948-8987-44c0-8adb-826735678e45` |
| 6 | `POST /v1/auth/token` | 401 | 27 | `qa-129942f2-e7b2-4a4a-bbd7-9d38e4cd96c1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-09234655-48e7-46fb-b8da-79165e88f255

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09234655-48e7-46fb-b8da-79165e88f255
Content-Type: application/json

--- request body ---
{"handle":"qa-15d8d74ab92b","displayName":"QA 15d8d74ab92b","password":"****","region":"eu"}

--- response: 201 in 524 ms ---
Date: Tue, 27 Oct 2026 08:00:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-09234655-48e7-46fb-b8da-79165e88f255
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
Location: /v1/accounts/qa-15d8d74ab92b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_22d5c8fb-1b91-408e-8d8c-bd2493584312","handle":"qa-15d8d74ab92b","displayName":"QA 15d8d74ab92b","region":"eu","role":"user","createdAt":"2026-10-27T08:00:28.845025274Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-fbc360dd-81fb-4aba-8c05-3330b9ce9073

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fbc360dd-81fb-4aba-8c05-3330b9ce9073
Content-Type: application/json

--- request body ---
{"handle":"qa-15d8d74ab92b","password":"****"}

--- response: 200 in 90 ms ---
Date: Tue, 27 Oct 2026 08:00:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-fbc360dd-81fb-4aba-8c05-3330b9ce9073
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_22d5c8fb-1b91-408e-8d8c-bd2493584312"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-3dbc8823-e272-4eb2-ae00-2dfb5514fe27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dbc8823-e272-4eb2-ae00-2dfb5514fe27
Content-Type: application/json

--- response: 404 in 86 ms ---
Date: Tue, 27 Oct 2026 08:00:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3dbc8823-e272-4eb2-ae00-2dfb5514fe27
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-3dbc8823-e272-4eb2-ae00-2dfb5514fe27"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-nobody-here
correlation: qa-052edd2d-651b-421a-af76-4118b442fcd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-052edd2d-651b-421a-af76-4118b442fcd2
Content-Type: application/json

--- response: 404 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-052edd2d-651b-421a-af76-4118b442fcd2
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
Content-Length: 247

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No account with handle 'qa-nobody-here'.","instance":"/v1/accounts/qa-nobody-here","correlationId":"qa-052edd2d-651b-421a-af76-4118b442fcd2"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ecc8d948-8987-44c0-8adb-826735678e45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecc8d948-8987-44c0-8adb-826735678e45
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ecc8d948-8987-44c0-8adb-826735678e45
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-129942f2-e7b2-4a4a-bbd7-9d38e4cd96c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-129942f2-e7b2-4a4a-bbd7-9d38e4cd96c1
Content-Type: application/json

--- request body ---
{"handle":"qa-15d8d74ab92b","password":"****"}

--- response: 401 in 27 ms ---
Date: Tue, 27 Oct 2026 08:00:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-129942f2-e7b2-4a4a-bbd7-9d38e4cd96c1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-129942f2-e7b2-4a4a-bbd7-9d38e4cd96c1"}
```
