# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 372 | `qa-9b8ef550-4899-40c2-bec7-505b219c1393` |
| 2 | `POST /v1/accounts` | 201 | 44 | `qa-545a0793-e98b-4e8c-99c6-04626bb2a65d` |
| 3 | `POST /v1/auth/token` | 200 | 47 | `qa-d3388a34-fd14-439b-aed1-f62575c965a6` |
| 4 | `POST /v1/conversations` | 201 | 39 | `qa-e1c95d6f-a941-418a-8a51-429fccce4b0f` |
| 5 | `POST /v1/auth/token` | 400 | 10 | `qa-32fd64be-ea4c-4927-b338-e053d8174a37` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-265c3d2f-7665-4bf1-a937-85f3e1d4dd37` |
| 7 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-cda715df-8f87-475b-9bfa-726df9298523` |
| 8 | `POST /v1/auth/token` | 401 | 37 | `qa-6ac8c649-8ba3-41b5-8d0d-4b872097e1cf` |
| 9 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-72252f7e-c722-4dc7-88ef-cd09139aa44d` |
| 10 | `POST /v1/auth/token` | 401 | 27 | `qa-9c3357dc-05d0-4322-a239-908d86752576` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9b8ef550-4899-40c2-bec7-505b219c1393

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b8ef550-4899-40c2-bec7-505b219c1393
Content-Type: application/json

--- request body ---
{"handle":"qa-1d4d435db8f6","displayName":"QA 1d4d435db8f6","password":"****","region":"eu"}

--- response: 201 in 372 ms ---
Date: Tue, 03 Nov 2026 09:41:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b8ef550-4899-40c2-bec7-505b219c1393
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
Location: /v1/accounts/qa-1d4d435db8f6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_67bea847-705e-4d8b-b98a-a8e4cdd782d3","handle":"qa-1d4d435db8f6","displayName":"QA 1d4d435db8f6","region":"eu","role":"user","createdAt":"2026-11-03T09:41:30.836360177Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-545a0793-e98b-4e8c-99c6-04626bb2a65d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-545a0793-e98b-4e8c-99c6-04626bb2a65d
Content-Type: application/json

--- request body ---
{"handle":"qa-8df08bd09fe5","displayName":"QA 8df08bd09fe5","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-545a0793-e98b-4e8c-99c6-04626bb2a65d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Location: /v1/accounts/qa-8df08bd09fe5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_809121cf-ee20-486b-aa9f-70f5b4f7bf70","handle":"qa-8df08bd09fe5","displayName":"QA 8df08bd09fe5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:31.225436579Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d3388a34-fd14-439b-aed1-f62575c965a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3388a34-fd14-439b-aed1-f62575c965a6
Content-Type: application/json

--- request body ---
{"handle":"qa-1d4d435db8f6","password":"****"}

--- response: 200 in 47 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3388a34-fd14-439b-aed1-f62575c965a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_67bea847-705e-4d8b-b98a-a8e4cdd782d3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e1c95d6f-a941-418a-8a51-429fccce4b0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1c95d6f-a941-418a-8a51-429fccce4b0f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8df08bd09fe5","subject":"Error contract","message":"Hi"}

--- response: 201 in 39 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1c95d6f-a941-418a-8a51-429fccce4b0f
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
Location: /v1/conversations/cnv_f63480a3-5de0-48a8-b7b2-19ed3d97ef7d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f63480a3-5de0-48a8-b7b2-19ed3d97ef7d","subject":"Error contract","status":"open","region":"eu","participants":["qa-1d4d435db8f6","qa-8df08bd09fe5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:31.402551394Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-32fd64be-ea4c-4927-b338-e053d8174a37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32fd64be-ea4c-4927-b338-e053d8174a37
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32fd64be-ea4c-4927-b338-e053d8174a37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 555
RateLimit-Reset: 10
Content-Length: 255

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/auth/token","correlationId":"qa-32fd64be-ea4c-4927-b338-e053d8174a37"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-265c3d2f-7665-4bf1-a937-85f3e1d4dd37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-265c3d2f-7665-4bf1-a937-85f3e1d4dd37
Content-Type: application/json

--- request body ---
{"handle":"qa-8df08bd09fe5","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-265c3d2f-7665-4bf1-a937-85f3e1d4dd37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_809121cf-ee20-486b-aa9f-70f5b4f7bf70"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cda715df-8f87-475b-9bfa-726df9298523

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cda715df-8f87-475b-9bfa-726df9298523
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cda715df-8f87-475b-9bfa-726df9298523
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
correlation: qa-6ac8c649-8ba3-41b5-8d0d-4b872097e1cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ac8c649-8ba3-41b5-8d0d-4b872097e1cf
Content-Type: application/json

--- request body ---
{"handle":"qa-8df08bd09fe5","password":"****"}

--- response: 401 in 37 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ac8c649-8ba3-41b5-8d0d-4b872097e1cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 542
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ac8c649-8ba3-41b5-8d0d-4b872097e1cf"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-72252f7e-c722-4dc7-88ef-cd09139aa44d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72252f7e-c722-4dc7-88ef-cd09139aa44d
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-72252f7e-c722-4dc7-88ef-cd09139aa44d
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
correlation: qa-9c3357dc-05d0-4322-a239-908d86752576

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c3357dc-05d0-4322-a239-908d86752576
Content-Type: application/json

--- request body ---
{"handle":"qa-1d4d435db8f6","password":"****"}

--- response: 401 in 27 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c3357dc-05d0-4322-a239-908d86752576
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9c3357dc-05d0-4322-a239-908d86752576"}
```
