# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/accounts]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[1]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 36 | `qa-f6a552db-00f5-4618-bb55-3762c54350ed` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-3148c3c7-4c0b-4bac-a2a0-af227e78752e` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-96603be0-9b4b-4c1a-b878-53d2a0781f71` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-6406a843-4254-4085-b97a-84a968c2c27f` |
| 5 | `POST /v1/accounts` | 503 | 18 | `qa-1105256a-f838-4bd3-809f-d9e8c9dbb33a` |
| 6 | `POST /v1/auth/token` | 200 | 53 | `qa-aa29b48b-c895-485d-89f1-f74859de9aea` |
| 7 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-ac43549b-6ab1-44ef-98b6-c624260ee04e` |
| 8 | `POST /v1/auth/token` | 401 | 25 | `qa-3d14f859-acd5-44dd-85a6-20df7368881e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-080972fb-9cd4-4557-85e4-c3fb0ee86d38` |
| 10 | `POST /v1/auth/token` | 401 | 32 | `qa-364624d1-bb49-49eb-a59e-6873fa95cab6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f6a552db-00f5-4618-bb55-3762c54350ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6a552db-00f5-4618-bb55-3762c54350ed
Content-Type: application/json

--- request body ---
{"handle":"qa-89f8ac43c1d5","displayName":"QA 89f8ac43c1d5","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6a552db-00f5-4618-bb55-3762c54350ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Location: /v1/accounts/qa-89f8ac43c1d5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9ecd1e74-109d-47cf-937e-57027b1b3adb","handle":"qa-89f8ac43c1d5","displayName":"QA 89f8ac43c1d5","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.117498649Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3148c3c7-4c0b-4bac-a2a0-af227e78752e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3148c3c7-4c0b-4bac-a2a0-af227e78752e
Content-Type: application/json

--- request body ---
{"handle":"qa-437e44c3e516","displayName":"QA 437e44c3e516","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-3148c3c7-4c0b-4bac-a2a0-af227e78752e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Location: /v1/accounts/qa-437e44c3e516
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4b311ee2-f4a7-4150-b63a-ab5e9f8e4041","handle":"qa-437e44c3e516","displayName":"QA 437e44c3e516","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.189595207Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-96603be0-9b4b-4c1a-b878-53d2a0781f71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96603be0-9b4b-4c1a-b878-53d2a0781f71
Content-Type: application/json

--- request body ---
{"handle":"qa-89f8ac43c1d5","password":"****"}

--- response: 200 in 47 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-96603be0-9b4b-4c1a-b878-53d2a0781f71
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9ecd1e74-109d-47cf-937e-57027b1b3adb"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6406a843-4254-4085-b97a-84a968c2c27f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6406a843-4254-4085-b97a-84a968c2c27f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-437e44c3e516","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6406a843-4254-4085-b97a-84a968c2c27f
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
Location: /v1/conversations/cnv_39cbd771-c06e-4118-9d6c-78aa6127316c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_39cbd771-c06e-4118-9d6c-78aa6127316c","subject":"Error contract","status":"open","region":"eu","participants":["qa-89f8ac43c1d5","qa-437e44c3e516"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-07T08:54:57.288953643Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-1105256a-f838-4bd3-809f-d9e8c9dbb33a

--- request headers ---
Accept: application/json
X-Fault-Key: bf46b343-c860-4c5a-ac69-03e868d2227f
X-Fault: unavailable-once
X-Correlation-Id: qa-1105256a-f838-4bd3-809f-d9e8c9dbb33a
Content-Type: application/json

--- request body ---
{"handle":"qa-60558cee2d7f","displayName":"QA 60558cee2d7f","password":"****","region":"eu"}

--- response: 503 in 18 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1105256a-f838-4bd3-809f-d9e8c9dbb33a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 256

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts","correlationId":"qa-1105256a-f838-4bd3-809f-d9e8c9dbb33a"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-aa29b48b-c895-485d-89f1-f74859de9aea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa29b48b-c895-485d-89f1-f74859de9aea
Content-Type: application/json

--- request body ---
{"handle":"qa-437e44c3e516","password":"****"}

--- response: 200 in 53 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa29b48b-c895-485d-89f1-f74859de9aea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 518
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4b311ee2-f4a7-4150-b63a-ab5e9f8e4041"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ac43549b-6ab1-44ef-98b6-c624260ee04e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac43549b-6ab1-44ef-98b6-c624260ee04e
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ac43549b-6ab1-44ef-98b6-c624260ee04e
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
correlation: qa-3d14f859-acd5-44dd-85a6-20df7368881e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d14f859-acd5-44dd-85a6-20df7368881e
Content-Type: application/json

--- request body ---
{"handle":"qa-437e44c3e516","password":"****"}

--- response: 401 in 25 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d14f859-acd5-44dd-85a6-20df7368881e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 498
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3d14f859-acd5-44dd-85a6-20df7368881e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-080972fb-9cd4-4557-85e4-c3fb0ee86d38

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-080972fb-9cd4-4557-85e4-c3fb0ee86d38
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-080972fb-9cd4-4557-85e4-c3fb0ee86d38
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
correlation: qa-364624d1-bb49-49eb-a59e-6873fa95cab6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-364624d1-bb49-49eb-a59e-6873fa95cab6
Content-Type: application/json

--- request body ---
{"handle":"qa-89f8ac43c1d5","password":"****"}

--- response: 401 in 32 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-364624d1-bb49-49eb-a59e-6873fa95cab6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 478
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-364624d1-bb49-49eb-a59e-6873fa95cab6"}
```
