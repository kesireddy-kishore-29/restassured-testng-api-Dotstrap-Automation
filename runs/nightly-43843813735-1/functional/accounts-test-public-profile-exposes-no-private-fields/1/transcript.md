# Transcript: Anyone signed in sees a public profile with no private fields

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#publicProfileExposesNoPrivateFields` |
| Features | FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-b4a0670c-bae0-475a-ad64-3eafb6220bd8` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-bfce9d9d-e3cd-4505-9301-ef60a3e9fb3e` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-332b4bb8-1a20-4cec-9e2d-fafa00dc5c80` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 12 | `qa-53d444b4-3711-4b84-a7cd-364f5bcc55be` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 7 | `qa-3247428e-7338-43c8-be48-3a34f463d424` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 6 | `qa-a7925ae4-5549-44d6-af75-e0a150725ab5` |
| 7 | `POST /v1/auth/token` | 200 | 16 | `qa-d428275f-8d0f-4a9b-934d-de9945a3922e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-a911b05a-fd13-4a9b-bb56-afbee8a386ae` |
| 9 | `POST /v1/auth/token` | 401 | 10 | `qa-6da132f1-bf7e-4327-9424-f63a008708c0` |
| 10 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-ea1c4d66-2a1c-4f10-9aca-ad6592855656` |
| 11 | `POST /v1/auth/token` | 401 | 12 | `qa-4b7ff247-6d85-4c0f-bcda-2993fce8e2d9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b4a0670c-bae0-475a-ad64-3eafb6220bd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4a0670c-bae0-475a-ad64-3eafb6220bd8
Content-Type: application/json

--- request body ---
{"handle":"qa-9a5485fcffb1","displayName":"QA 9a5485fcffb1","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4a0670c-bae0-475a-ad64-3eafb6220bd8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-9a5485fcffb1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d69537a4-0830-4484-a422-fce7d6367ff3","handle":"qa-9a5485fcffb1","displayName":"QA 9a5485fcffb1","region":"eu","role":"user","createdAt":"2026-11-16T09:53:52.834364448Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-bfce9d9d-e3cd-4505-9301-ef60a3e9fb3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfce9d9d-e3cd-4505-9301-ef60a3e9fb3e
Content-Type: application/json

--- request body ---
{"handle":"qa-0639142176bf","displayName":"QA 0639142176bf","password":"****","region":"us"}

--- response: 201 in 23 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfce9d9d-e3cd-4505-9301-ef60a3e9fb3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-0639142176bf
X-Served-Region: us
Content-Length: 181

{"id":"acc_01065459-ab2c-4a1a-8beb-6f09f9ca718d","handle":"qa-0639142176bf","displayName":"QA 0639142176bf","region":"us","role":"user","createdAt":"2026-11-16T09:53:52.868002751Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-332b4bb8-1a20-4cec-9e2d-fafa00dc5c80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-332b4bb8-1a20-4cec-9e2d-fafa00dc5c80
Content-Type: application/json

--- request body ---
{"handle":"qa-9a5485fcffb1","password":"****"}

--- response: 200 in 24 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-332b4bb8-1a20-4cec-9e2d-fafa00dc5c80
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d69537a4-0830-4484-a422-fce7d6367ff3"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-0639142176bf
correlation: qa-53d444b4-3711-4b84-a7cd-364f5bcc55be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53d444b4-3711-4b84-a7cd-364f5bcc55be
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-53d444b4-3711-4b84-a7cd-364f5bcc55be
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
Content-Length: 74

{"handle":"qa-0639142176bf","displayName":"QA 0639142176bf","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-0639142176bf
correlation: qa-3247428e-7338-43c8-be48-3a34f463d424

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3247428e-7338-43c8-be48-3a34f463d424
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-3247428e-7338-43c8-be48-3a34f463d424
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
Content-Length: 74

{"handle":"qa-0639142176bf","displayName":"QA 0639142176bf","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-0639142176bf
correlation: qa-a7925ae4-5549-44d6-af75-e0a150725ab5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7925ae4-5549-44d6-af75-e0a150725ab5
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7925ae4-5549-44d6-af75-e0a150725ab5
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
Content-Length: 74

{"handle":"qa-0639142176bf","displayName":"QA 0639142176bf","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-d428275f-8d0f-4a9b-934d-de9945a3922e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d428275f-8d0f-4a9b-934d-de9945a3922e
Content-Type: application/json

--- request body ---
{"handle":"qa-0639142176bf","password":"****"}

--- response: 200 in 16 ms ---
Date: Mon, 16 Nov 2026 09:53:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-d428275f-8d0f-4a9b-934d-de9945a3922e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_01065459-ab2c-4a1a-8beb-6f09f9ca718d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a911b05a-fd13-4a9b-bb56-afbee8a386ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a911b05a-fd13-4a9b-bb56-afbee8a386ae
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a911b05a-fd13-4a9b-bb56-afbee8a386ae
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
X-Served-Region: us
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-6da132f1-bf7e-4327-9424-f63a008708c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6da132f1-bf7e-4327-9424-f63a008708c0
Content-Type: application/json

--- request body ---
{"handle":"qa-0639142176bf","password":"****"}

--- response: 401 in 10 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6da132f1-bf7e-4327-9424-f63a008708c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6da132f1-bf7e-4327-9424-f63a008708c0"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ea1c4d66-2a1c-4f10-9aca-ad6592855656

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea1c4d66-2a1c-4f10-9aca-ad6592855656
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ea1c4d66-2a1c-4f10-9aca-ad6592855656
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
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-4b7ff247-6d85-4c0f-bcda-2993fce8e2d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b7ff247-6d85-4c0f-bcda-2993fce8e2d9
Content-Type: application/json

--- request body ---
{"handle":"qa-9a5485fcffb1","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 16 Nov 2026 09:53:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b7ff247-6d85-4c0f-bcda-2993fce8e2d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4b7ff247-6d85-4c0f-bcda-2993fce8e2d9"}
```
