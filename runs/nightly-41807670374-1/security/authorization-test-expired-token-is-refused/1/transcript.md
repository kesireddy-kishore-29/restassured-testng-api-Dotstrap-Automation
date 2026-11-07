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
| 1 | `POST /v1/accounts` | 201 | 381 | `qa-e98f6e13-ceee-4ead-afdc-87b5329fce72` |
| 2 | `POST /v1/auth/token` | 200 | 47 | `qa-9b4db48b-01f7-47d6-a968-517a69fea37a` |
| 3 | `GET /v1/accounts/me` | 200 | 15 | `qa-0745690b-19cc-4420-9476-53c86d74f037` |
| 4 | `GET /v1/accounts/me` | 200 | 9 | `qa-231dd847-ddc2-4034-9f81-cb5c2617593e` |
| 5 | `GET /v1/accounts/me` | 200 | 9 | `qa-3e77d783-49df-435e-89f9-42b6cc7de31b` |
| 6 | `GET /v1/accounts/me` | 401 | 9 | `qa-ef230d99-66b7-45fa-9814-84bcfba80e5d` |
| 7 | `GET /v1/accounts/me` | 401 | 8 | `qa-5a354b8c-5d38-4d4c-8fa9-fa8ea6d3fbfa` |
| 8 | `POST /v1/auth/token` | 200 | 14 | `qa-58afdfd7-eafd-4de2-a110-c3ae627b3d2e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-7431910c-8108-4a8b-a860-4773cd24b9a1` |
| 10 | `POST /v1/auth/token` | 401 | 8 | `qa-9ae364ba-0146-4f61-b701-ba9f32bfce49` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e98f6e13-ceee-4ead-afdc-87b5329fce72

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e98f6e13-ceee-4ead-afdc-87b5329fce72
Content-Type: application/json

--- request body ---
{"handle":"qa-8b19535674ba","displayName":"QA 8b19535674ba","password":"****","region":"eu"}

--- response: 201 in 381 ms ---
Date: Wed, 04 Nov 2026 09:28:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-e98f6e13-ceee-4ead-afdc-87b5329fce72
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-8b19535674ba
X-Served-Region: eu
Content-Length: 181

{"id":"acc_91015ab6-9163-4141-b7e7-910a750462fc","handle":"qa-8b19535674ba","displayName":"QA 8b19535674ba","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.253294110Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9b4db48b-01f7-47d6-a968-517a69fea37a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b4db48b-01f7-47d6-a968-517a69fea37a
Content-Type: application/json

--- request body ---
{"handle":"qa-8b19535674ba","password":"****","ttlSeconds":1}

--- response: 200 in 47 ms ---
Date: Wed, 04 Nov 2026 09:28:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b4db48b-01f7-47d6-a968-517a69fea37a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_91015ab6-9163-4141-b7e7-910a750462fc"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-0745690b-19cc-4420-9476-53c86d74f037

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0745690b-19cc-4420-9476-53c86d74f037
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-0745690b-19cc-4420-9476-53c86d74f037
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

{"id":"acc_91015ab6-9163-4141-b7e7-910a750462fc","handle":"qa-8b19535674ba","displayName":"QA 8b19535674ba","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.253294110Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-231dd847-ddc2-4034-9f81-cb5c2617593e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-231dd847-ddc2-4034-9f81-cb5c2617593e
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-231dd847-ddc2-4034-9f81-cb5c2617593e
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

{"id":"acc_91015ab6-9163-4141-b7e7-910a750462fc","handle":"qa-8b19535674ba","displayName":"QA 8b19535674ba","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.253294110Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-3e77d783-49df-435e-89f9-42b6cc7de31b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e77d783-49df-435e-89f9-42b6cc7de31b
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e77d783-49df-435e-89f9-42b6cc7de31b
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

{"id":"acc_91015ab6-9163-4141-b7e7-910a750462fc","handle":"qa-8b19535674ba","displayName":"QA 8b19535674ba","region":"eu","role":"user","createdAt":"2026-11-04T09:28:20.253294110Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-ef230d99-66b7-45fa-9814-84bcfba80e5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef230d99-66b7-45fa-9814-84bcfba80e5d
Content-Type: application/json

--- response: 401 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef230d99-66b7-45fa-9814-84bcfba80e5d
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-ef230d99-66b7-45fa-9814-84bcfba80e5d"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a354b8c-5d38-4d4c-8fa9-fa8ea6d3fbfa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a354b8c-5d38-4d4c-8fa9-fa8ea6d3fbfa
Content-Type: application/json

--- response: 401 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a354b8c-5d38-4d4c-8fa9-fa8ea6d3fbfa
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-5a354b8c-5d38-4d4c-8fa9-fa8ea6d3fbfa"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-58afdfd7-eafd-4de2-a110-c3ae627b3d2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58afdfd7-eafd-4de2-a110-c3ae627b3d2e
Content-Type: application/json

--- request body ---
{"handle":"qa-8b19535674ba","password":"****"}

--- response: 200 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/json
X-Correlation-Id: qa-58afdfd7-eafd-4de2-a110-c3ae627b3d2e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_91015ab6-9163-4141-b7e7-910a750462fc"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7431910c-8108-4a8b-a860-4773cd24b9a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7431910c-8108-4a8b-a860-4773cd24b9a1
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7431910c-8108-4a8b-a860-4773cd24b9a1
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
correlation: qa-9ae364ba-0146-4f61-b701-ba9f32bfce49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ae364ba-0146-4f61-b701-ba9f32bfce49
Content-Type: application/json

--- request body ---
{"handle":"qa-8b19535674ba","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 04 Nov 2026 09:28:21 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ae364ba-0146-4f61-b701-ba9f32bfce49
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9ae364ba-0146-4f61-b701-ba9f32bfce49"}
```
