# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 83 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 391 | `qa-b270cbc7-0821-4da5-9707-2089be09ff48` |
| 2 | `POST /v1/auth/token` | 200 | 58 | `qa-ed7dfdfa-5d50-4466-9f8f-9e6908844e8b` |
| 3 | `GET /v1/accounts/me` | 200 | 68 | `qa-8b9258f2-81ec-4b17-8732-ea52be4b8456` |
| 4 | `GET /v1/accounts/me` | 200 | 15 | `qa-2c53367d-03b8-4e57-aa24-079b719f8a12` |
| 5 | `GET /v1/accounts/me` | 200 | 21 | `qa-ac47cf80-2bb2-4a56-b909-6bc59341417d` |
| 6 | `GET /v1/accounts/me` | 200 | 16 | `qa-ecc6b680-a9de-4baa-afe3-bd65f16ae450` |
| 7 | `GET /v1/accounts/me` | 200 | 12 | `qa-702d6539-2c08-4dd6-a055-217a762ae107` |
| 8 | `GET /v1/accounts/me` | 200 | 7 | `qa-02af23f6-2935-4ee7-845a-86e370e62a74` |
| 9 | `GET /v1/accounts/me` | 200 | 8 | `qa-8c5e19b2-7446-47bf-8874-2c11f2ab8af8` |
| 10 | `GET /v1/accounts/me` | 200 | 12 | `qa-c869bfac-cf50-486d-9090-d6597f2b3cac` |
| 11 | `GET /v1/accounts/me` | 200 | 10 | `qa-be591b27-e225-4983-aa7a-7f9cadde0ebd` |
| 12 | `GET /v1/accounts/me` | 200 | 10 | `qa-b5ab7cff-5d84-4bfd-97a0-c87a13218f5a` |
| 13 | `GET /v1/accounts/me` | 200 | 10 | `qa-e09a8f02-c36e-4a25-b995-c6f61e901b7f` |
| 14 | `GET /v1/accounts/me` | 200 | 17 | `qa-98b50b4b-c1b6-4e21-91d2-6166c42de130` |
| 15 | `GET /v1/accounts/me` | 200 | 7 | `qa-68a75f0d-ea8a-49e3-a0bc-383e0a6d105a` |
| 16 | `GET /v1/accounts/me` | 200 | 13 | `qa-09da8604-53f3-49b1-af9a-2be91b06d6b5` |
| 17 | `GET /v1/accounts/me` | 200 | 8 | `qa-630ab3a3-3fd9-4598-bf28-d78748161c92` |
| 18 | `GET /v1/accounts/me` | 200 | 15 | `qa-7a3cc0cb-3829-4aee-8a8c-7de5c933736b` |
| 19 | `GET /v1/accounts/me` | 200 | 13 | `qa-00b4d536-4fad-40b3-bb9f-d2e453810eab` |
| 20 | `GET /v1/accounts/me` | 200 | 9 | `qa-53132fbf-0295-421b-a21d-6a87b2a484fc` |
| 21 | `GET /v1/accounts/me` | 200 | 9 | `qa-af0a362c-b4d5-49ea-831b-0dc5c36f4a49` |
| 22 | `GET /v1/accounts/me` | 200 | 7 | `qa-4cfb14c2-e938-4b1a-8073-cd3ddf6aa5fb` |
| 23 | `GET /v1/accounts/me` | 200 | 9 | `qa-d8043200-82da-42c7-a930-376295ae012f` |
| 24 | `GET /v1/accounts/me` | 200 | 8 | `qa-afb967a8-e249-4c38-8312-5b9d2a4ac91d` |
| 25 | `GET /v1/accounts/me` | 200 | 11 | `qa-5961356b-5b67-4deb-8e19-a1525b2cfecc` |
| 26 | `GET /v1/accounts/me` | 200 | 10 | `qa-4cad8638-571f-4657-b127-3a4967c251d6` |
| 27 | `GET /v1/accounts/me` | 200 | 9 | `qa-06e3ca65-7a9c-4479-bde9-e5b2dd1eabb4` |
| 28 | `GET /v1/accounts/me` | 200 | 13 | `qa-0677dbde-1a01-4365-b8fc-b3d05cbf37b9` |
| 29 | `GET /v1/accounts/me` | 200 | 11 | `qa-c49c0ad0-3df1-41b2-a39c-9b63a7c22658` |
| 30 | `GET /v1/accounts/me` | 200 | 8 | `qa-6b6d7ec6-3982-4d62-9d5e-ac31147590f6` |
| 31 | `GET /v1/accounts/me` | 200 | 9 | `qa-ce5ee617-0d33-48c1-835b-52baa4133695` |
| 32 | `GET /v1/accounts/me` | 200 | 12 | `qa-1dee6a89-d7eb-41f8-8ea0-5e0ceab1e404` |
| 33 | `GET /v1/accounts/me` | 200 | 8 | `qa-66de2acc-5cc8-45fd-8064-ddd045179f4b` |
| 34 | `GET /v1/accounts/me` | 200 | 7 | `qa-17920cde-e219-4366-b42d-9088a34c138d` |
| 35 | `GET /v1/accounts/me` | 200 | 12 | `qa-420f033c-c7ae-4ac5-984b-24e58eabd775` |
| 36 | `GET /v1/accounts/me` | 200 | 5 | `qa-ba59e41c-4489-4e05-bcc6-c54f9d142769` |
| 37 | `GET /v1/accounts/me` | 200 | 5 | `qa-2e5d8c49-55f0-496c-a107-0ac4a253063c` |
| 38 | `GET /v1/accounts/me` | 200 | 5 | `qa-5b1f8be9-8c69-4c6e-ab76-547121e5ccb4` |
| 39 | `GET /v1/accounts/me` | 200 | 6 | `qa-c19e02b8-1419-40b0-8793-ef9a12ac0c1c` |
| 40 | `GET /v1/accounts/me` | 200 | 4 | `qa-6e42470b-7035-4e3e-8037-e7b1fcc84009` |
| 41 | `GET /v1/accounts/me` | 200 | 5 | `qa-a3f2ca56-cc6e-4700-91f2-f7c9a6b5a5c8` |
| 42 | `GET /v1/accounts/me` | 200 | 4 | `qa-8f5b8164-24e5-4474-8b8f-312e7759a39a` |
| 43 | `GET /v1/accounts/me` | 200 | 4 | `qa-8dfcf1f6-4b39-4e5b-ad5f-c9edbf7e1931` |
| 44 | `GET /v1/accounts/me` | 200 | 7 | `qa-06312a3e-b041-477c-a2c3-98cfc53f0cce` |
| 45 | `GET /v1/accounts/me` | 200 | 5 | `qa-d1bc4e09-da69-48bf-b93c-05fb132d5751` |
| 46 | `GET /v1/accounts/me` | 200 | 5 | `qa-1abdbedd-cdde-4860-a6c0-6154ab987eb1` |
| 47 | `GET /v1/accounts/me` | 200 | 5 | `qa-18c00234-afcd-47b3-b92f-444c71bdce67` |
| 48 | `GET /v1/accounts/me` | 200 | 4 | `qa-5e93c43f-7339-47cd-bf3c-000fe72d3504` |
| 49 | `GET /v1/accounts/me` | 200 | 6 | `qa-705dd47b-3b9a-4db7-8a20-96d78686069b` |
| 50 | `GET /v1/accounts/me` | 200 | 7 | `qa-8e4e7bce-d87b-47d1-8f66-a74d6cf576bb` |
| 51 | `GET /v1/accounts/me` | 200 | 6 | `qa-83d01ef8-c773-4669-a0f5-e4bca543c293` |
| 52 | `GET /v1/accounts/me` | 200 | 5 | `qa-13428c78-a0f9-4f00-8135-04d55cc21f06` |
| 53 | `GET /v1/accounts/me` | 200 | 5 | `qa-77a21955-4ea4-4205-9c84-37934a898490` |
| 54 | `GET /v1/accounts/me` | 200 | 6 | `qa-04db4945-8cd1-4969-a45d-c0841d931bea` |
| 55 | `GET /v1/accounts/me` | 200 | 6 | `qa-b0812a3d-22bb-49a6-9c13-ad58f529a7de` |
| 56 | `GET /v1/accounts/me` | 200 | 5 | `qa-54776867-1044-4518-80b5-ad3f480f8279` |
| 57 | `GET /v1/accounts/me` | 200 | 10 | `qa-2faa6eed-8a81-4671-8c0f-c345f950312a` |
| 58 | `GET /v1/accounts/me` | 200 | 5 | `qa-4125ea73-b660-4258-9686-bc1ba7959401` |
| 59 | `GET /v1/accounts/me` | 200 | 4 | `qa-3ab6a2ae-32ae-4702-8c6b-a498f7a1e01e` |
| 60 | `GET /v1/accounts/me` | 200 | 5 | `qa-089ce448-2c1b-4212-9c56-d56c29c9ceb2` |
| 61 | `GET /v1/accounts/me` | 200 | 5 | `qa-cc976e9a-f3bf-4428-9c8c-f1255df9dc44` |
| 62 | `GET /v1/accounts/me` | 200 | 5 | `qa-924e3d40-98b7-4868-a029-c4f04e1b2193` |
| 63 | `GET /v1/accounts/me` | 429 | 4 | `qa-c3324746-215c-4df5-a9ab-63abee3b7e83` |
| 64 | `GET /v1/accounts/me` | 429 | 5 | `qa-6adedac4-1cb8-49e8-8116-da74a75f86bb` |
| 65 | `GET /v1/accounts/me` | 429 | 5 | `qa-48e637bf-3aa5-49d2-b67b-da7c0e06f468` |
| 66 | `GET /v1/accounts/me` | 429 | 5 | `qa-7cc4b392-93ac-4295-8867-a2aabceae082` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-8567a995-9a7e-4ddf-a73f-9e71390c6ce9` |
| 68 | `GET /v1/accounts/me` | 429 | 4 | `qa-26c120b5-7451-4b79-8d57-0c4bbb674569` |
| 69 | `GET /v1/accounts/me` | 429 | 6 | `qa-ef3ae2c1-4081-437b-9c45-fecf54654a8b` |
| 70 | `GET /v1/accounts/me` | 429 | 4 | `qa-dbe1aa4e-0413-405d-b41a-0f99c7ddba69` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-9befb0bc-1ba3-4c39-9ca4-423db05bb6d7` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-b10dae09-a582-4563-918d-6f809aa55423` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-3db088f1-0fc4-49af-98a6-6fa2527c5d16` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-f58fbd03-05f1-458c-a5eb-55167a0ce28e` |
| 75 | `GET /v1/accounts/me` | 429 | 5 | `qa-35d33449-d234-463b-b755-1edc635f6833` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-c0294121-3af6-4801-8700-74b5bc3d298d` |
| 77 | `GET /v1/accounts/me` | 429 | 5 | `qa-138d9d88-426b-4ef9-a836-97040b894ffd` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-daab23ff-2972-4112-a23f-985b9fbd8d17` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-b7ccc87c-a8ce-4b7e-b94c-e2e081f06019` |
| 80 | `GET /v1/accounts/me` | 429 | 3 | `qa-606fd266-551f-4996-9cb7-3326a688e2dc` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-a2305414-88da-4737-bb3f-45dae2cf4172` |
| 82 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-ee54474b-5de1-4fcc-883a-8ea23739a211` |
| 83 | `POST /v1/auth/token` | 401 | 4 | `qa-853938fb-ebb8-4570-b998-eedb5faa58b7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b270cbc7-0821-4da5-9707-2089be09ff48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b270cbc7-0821-4da5-9707-2089be09ff48
Content-Type: application/json

--- request body ---
{"handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","password":"****","region":"eu"}

--- response: 201 in 391 ms ---
Date: Tue, 24 Nov 2026 12:38:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-b270cbc7-0821-4da5-9707-2089be09ff48
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
Location: /v1/accounts/qa-dcd4f6abf941
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ed7dfdfa-5d50-4466-9f8f-9e6908844e8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed7dfdfa-5d50-4466-9f8f-9e6908844e8b
Content-Type: application/json

--- request body ---
{"handle":"qa-dcd4f6abf941","password":"****"}

--- response: 200 in 58 ms ---
Date: Tue, 24 Nov 2026 12:38:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed7dfdfa-5d50-4466-9f8f-9e6908844e8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b9258f2-81ec-4b17-8732-ea52be4b8456

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b9258f2-81ec-4b17-8732-ea52be4b8456
Content-Type: application/json

--- response: 200 in 68 ms ---
Date: Tue, 24 Nov 2026 12:38:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b9258f2-81ec-4b17-8732-ea52be4b8456
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

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-2c53367d-03b8-4e57-aa24-079b719f8a12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c53367d-03b8-4e57-aa24-079b719f8a12
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c53367d-03b8-4e57-aa24-079b719f8a12
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

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac47cf80-2bb2-4a56-b909-6bc59341417d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac47cf80-2bb2-4a56-b909-6bc59341417d
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac47cf80-2bb2-4a56-b909-6bc59341417d
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

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-ecc6b680-a9de-4baa-afe3-bd65f16ae450

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecc6b680-a9de-4baa-afe3-bd65f16ae450
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecc6b680-a9de-4baa-afe3-bd65f16ae450
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
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-702d6539-2c08-4dd6-a055-217a762ae107

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-702d6539-2c08-4dd6-a055-217a762ae107
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-702d6539-2c08-4dd6-a055-217a762ae107
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
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-02af23f6-2935-4ee7-845a-86e370e62a74

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02af23f6-2935-4ee7-845a-86e370e62a74
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-02af23f6-2935-4ee7-845a-86e370e62a74
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c5e19b2-7446-47bf-8874-2c11f2ab8af8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c5e19b2-7446-47bf-8874-2c11f2ab8af8
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c5e19b2-7446-47bf-8874-2c11f2ab8af8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-c869bfac-cf50-486d-9090-d6597f2b3cac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c869bfac-cf50-486d-9090-d6597f2b3cac
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-c869bfac-cf50-486d-9090-d6597f2b3cac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-be591b27-e225-4983-aa7a-7f9cadde0ebd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be591b27-e225-4983-aa7a-7f9cadde0ebd
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-be591b27-e225-4983-aa7a-7f9cadde0ebd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-b5ab7cff-5d84-4bfd-97a0-c87a13218f5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b5ab7cff-5d84-4bfd-97a0-c87a13218f5a
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-b5ab7cff-5d84-4bfd-97a0-c87a13218f5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-e09a8f02-c36e-4a25-b995-c6f61e901b7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e09a8f02-c36e-4a25-b995-c6f61e901b7f
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e09a8f02-c36e-4a25-b995-c6f61e901b7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-98b50b4b-c1b6-4e21-91d2-6166c42de130

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98b50b4b-c1b6-4e21-91d2-6166c42de130
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-98b50b4b-c1b6-4e21-91d2-6166c42de130
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-68a75f0d-ea8a-49e3-a0bc-383e0a6d105a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68a75f0d-ea8a-49e3-a0bc-383e0a6d105a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-68a75f0d-ea8a-49e3-a0bc-383e0a6d105a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-09da8604-53f3-49b1-af9a-2be91b06d6b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09da8604-53f3-49b1-af9a-2be91b06d6b5
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-09da8604-53f3-49b1-af9a-2be91b06d6b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-630ab3a3-3fd9-4598-bf28-d78748161c92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-630ab3a3-3fd9-4598-bf28-d78748161c92
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-630ab3a3-3fd9-4598-bf28-d78748161c92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-7a3cc0cb-3829-4aee-8a8c-7de5c933736b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a3cc0cb-3829-4aee-8a8c-7de5c933736b
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a3cc0cb-3829-4aee-8a8c-7de5c933736b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-00b4d536-4fad-40b3-bb9f-d2e453810eab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00b4d536-4fad-40b3-bb9f-d2e453810eab
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-00b4d536-4fad-40b3-bb9f-d2e453810eab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-53132fbf-0295-421b-a21d-6a87b2a484fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53132fbf-0295-421b-a21d-6a87b2a484fc
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-53132fbf-0295-421b-a21d-6a87b2a484fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-af0a362c-b4d5-49ea-831b-0dc5c36f4a49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af0a362c-b4d5-49ea-831b-0dc5c36f4a49
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-af0a362c-b4d5-49ea-831b-0dc5c36f4a49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-4cfb14c2-e938-4b1a-8073-cd3ddf6aa5fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cfb14c2-e938-4b1a-8073-cd3ddf6aa5fb
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cfb14c2-e938-4b1a-8073-cd3ddf6aa5fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-d8043200-82da-42c7-a930-376295ae012f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8043200-82da-42c7-a930-376295ae012f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8043200-82da-42c7-a930-376295ae012f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-afb967a8-e249-4c38-8312-5b9d2a4ac91d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-afb967a8-e249-4c38-8312-5b9d2a4ac91d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-afb967a8-e249-4c38-8312-5b9d2a4ac91d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-5961356b-5b67-4deb-8e19-a1525b2cfecc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5961356b-5b67-4deb-8e19-a1525b2cfecc
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-5961356b-5b67-4deb-8e19-a1525b2cfecc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-4cad8638-571f-4657-b127-3a4967c251d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cad8638-571f-4657-b127-3a4967c251d6
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-4cad8638-571f-4657-b127-3a4967c251d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-06e3ca65-7a9c-4479-bde9-e5b2dd1eabb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06e3ca65-7a9c-4479-bde9-e5b2dd1eabb4
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-06e3ca65-7a9c-4479-bde9-e5b2dd1eabb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-0677dbde-1a01-4365-b8fc-b3d05cbf37b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0677dbde-1a01-4365-b8fc-b3d05cbf37b9
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-0677dbde-1a01-4365-b8fc-b3d05cbf37b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-c49c0ad0-3df1-41b2-a39c-9b63a7c22658

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c49c0ad0-3df1-41b2-a39c-9b63a7c22658
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-c49c0ad0-3df1-41b2-a39c-9b63a7c22658
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-6b6d7ec6-3982-4d62-9d5e-ac31147590f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b6d7ec6-3982-4d62-9d5e-ac31147590f6
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b6d7ec6-3982-4d62-9d5e-ac31147590f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-ce5ee617-0d33-48c1-835b-52baa4133695

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce5ee617-0d33-48c1-835b-52baa4133695
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce5ee617-0d33-48c1-835b-52baa4133695
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-1dee6a89-d7eb-41f8-8ea0-5e0ceab1e404

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1dee6a89-d7eb-41f8-8ea0-5e0ceab1e404
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-1dee6a89-d7eb-41f8-8ea0-5e0ceab1e404
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-66de2acc-5cc8-45fd-8064-ddd045179f4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66de2acc-5cc8-45fd-8064-ddd045179f4b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-66de2acc-5cc8-45fd-8064-ddd045179f4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-17920cde-e219-4366-b42d-9088a34c138d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17920cde-e219-4366-b42d-9088a34c138d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-17920cde-e219-4366-b42d-9088a34c138d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-420f033c-c7ae-4ac5-984b-24e58eabd775

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-420f033c-c7ae-4ac5-984b-24e58eabd775
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-420f033c-c7ae-4ac5-984b-24e58eabd775
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-ba59e41c-4489-4e05-bcc6-c54f9d142769

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba59e41c-4489-4e05-bcc6-c54f9d142769
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba59e41c-4489-4e05-bcc6-c54f9d142769
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e5d8c49-55f0-496c-a107-0ac4a253063c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e5d8c49-55f0-496c-a107-0ac4a253063c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e5d8c49-55f0-496c-a107-0ac4a253063c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-5b1f8be9-8c69-4c6e-ab76-547121e5ccb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b1f8be9-8c69-4c6e-ab76-547121e5ccb4
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b1f8be9-8c69-4c6e-ab76-547121e5ccb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-c19e02b8-1419-40b0-8793-ef9a12ac0c1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c19e02b8-1419-40b0-8793-ef9a12ac0c1c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-c19e02b8-1419-40b0-8793-ef9a12ac0c1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-6e42470b-7035-4e3e-8037-e7b1fcc84009

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e42470b-7035-4e3e-8037-e7b1fcc84009
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e42470b-7035-4e3e-8037-e7b1fcc84009
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-a3f2ca56-cc6e-4700-91f2-f7c9a6b5a5c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3f2ca56-cc6e-4700-91f2-f7c9a6b5a5c8
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3f2ca56-cc6e-4700-91f2-f7c9a6b5a5c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f5b8164-24e5-4474-8b8f-312e7759a39a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f5b8164-24e5-4474-8b8f-312e7759a39a
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f5b8164-24e5-4474-8b8f-312e7759a39a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-8dfcf1f6-4b39-4e5b-ad5f-c9edbf7e1931

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dfcf1f6-4b39-4e5b-ad5f-c9edbf7e1931
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-8dfcf1f6-4b39-4e5b-ad5f-c9edbf7e1931
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-06312a3e-b041-477c-a2c3-98cfc53f0cce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-06312a3e-b041-477c-a2c3-98cfc53f0cce
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-06312a3e-b041-477c-a2c3-98cfc53f0cce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-d1bc4e09-da69-48bf-b93c-05fb132d5751

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1bc4e09-da69-48bf-b93c-05fb132d5751
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1bc4e09-da69-48bf-b93c-05fb132d5751
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-1abdbedd-cdde-4860-a6c0-6154ab987eb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1abdbedd-cdde-4860-a6c0-6154ab987eb1
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-1abdbedd-cdde-4860-a6c0-6154ab987eb1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-18c00234-afcd-47b3-b92f-444c71bdce67

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18c00234-afcd-47b3-b92f-444c71bdce67
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-18c00234-afcd-47b3-b92f-444c71bdce67
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-5e93c43f-7339-47cd-bf3c-000fe72d3504

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e93c43f-7339-47cd-bf3c-000fe72d3504
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e93c43f-7339-47cd-bf3c-000fe72d3504
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-705dd47b-3b9a-4db7-8a20-96d78686069b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-705dd47b-3b9a-4db7-8a20-96d78686069b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-705dd47b-3b9a-4db7-8a20-96d78686069b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-8e4e7bce-d87b-47d1-8f66-a74d6cf576bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e4e7bce-d87b-47d1-8f66-a74d6cf576bb
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-8e4e7bce-d87b-47d1-8f66-a74d6cf576bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-83d01ef8-c773-4669-a0f5-e4bca543c293

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83d01ef8-c773-4669-a0f5-e4bca543c293
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-83d01ef8-c773-4669-a0f5-e4bca543c293
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-13428c78-a0f9-4f00-8135-04d55cc21f06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13428c78-a0f9-4f00-8135-04d55cc21f06
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-13428c78-a0f9-4f00-8135-04d55cc21f06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-77a21955-4ea4-4205-9c84-37934a898490

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77a21955-4ea4-4205-9c84-37934a898490
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-77a21955-4ea4-4205-9c84-37934a898490
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-04db4945-8cd1-4969-a45d-c0841d931bea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04db4945-8cd1-4969-a45d-c0841d931bea
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-04db4945-8cd1-4969-a45d-c0841d931bea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-b0812a3d-22bb-49a6-9c13-ad58f529a7de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0812a3d-22bb-49a6-9c13-ad58f529a7de
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0812a3d-22bb-49a6-9c13-ad58f529a7de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-54776867-1044-4518-80b5-ad3f480f8279

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54776867-1044-4518-80b5-ad3f480f8279
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-54776867-1044-4518-80b5-ad3f480f8279
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-2faa6eed-8a81-4671-8c0f-c345f950312a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2faa6eed-8a81-4671-8c0f-c345f950312a
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-2faa6eed-8a81-4671-8c0f-c345f950312a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-4125ea73-b660-4258-9686-bc1ba7959401

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4125ea73-b660-4258-9686-bc1ba7959401
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-4125ea73-b660-4258-9686-bc1ba7959401
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-3ab6a2ae-32ae-4702-8c6b-a498f7a1e01e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ab6a2ae-32ae-4702-8c6b-a498f7a1e01e
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ab6a2ae-32ae-4702-8c6b-a498f7a1e01e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-089ce448-2c1b-4212-9c56-d56c29c9ceb2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-089ce448-2c1b-4212-9c56-d56c29c9ceb2
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-089ce448-2c1b-4212-9c56-d56c29c9ceb2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-cc976e9a-f3bf-4428-9c8c-f1255df9dc44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc976e9a-f3bf-4428-9c8c-f1255df9dc44
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc976e9a-f3bf-4428-9c8c-f1255df9dc44
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-924e3d40-98b7-4868-a029-c4f04e1b2193

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-924e3d40-98b7-4868-a029-c4f04e1b2193
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-924e3d40-98b7-4868-a029-c4f04e1b2193
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-c3324746-215c-4df5-a9ab-63abee3b7e83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3324746-215c-4df5-a9ab-63abee3b7e83
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3324746-215c-4df5-a9ab-63abee3b7e83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c3324746-215c-4df5-a9ab-63abee3b7e83"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-6adedac4-1cb8-49e8-8116-da74a75f86bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6adedac4-1cb8-49e8-8116-da74a75f86bb
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6adedac4-1cb8-49e8-8116-da74a75f86bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6adedac4-1cb8-49e8-8116-da74a75f86bb"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-48e637bf-3aa5-49d2-b67b-da7c0e06f468

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48e637bf-3aa5-49d2-b67b-da7c0e06f468
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48e637bf-3aa5-49d2-b67b-da7c0e06f468
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-48e637bf-3aa5-49d2-b67b-da7c0e06f468"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-7cc4b392-93ac-4295-8867-a2aabceae082

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cc4b392-93ac-4295-8867-a2aabceae082
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7cc4b392-93ac-4295-8867-a2aabceae082
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7cc4b392-93ac-4295-8867-a2aabceae082"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-8567a995-9a7e-4ddf-a73f-9e71390c6ce9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8567a995-9a7e-4ddf-a73f-9e71390c6ce9
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8567a995-9a7e-4ddf-a73f-9e71390c6ce9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8567a995-9a7e-4ddf-a73f-9e71390c6ce9"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-26c120b5-7451-4b79-8d57-0c4bbb674569

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26c120b5-7451-4b79-8d57-0c4bbb674569
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-26c120b5-7451-4b79-8d57-0c4bbb674569
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-26c120b5-7451-4b79-8d57-0c4bbb674569"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-ef3ae2c1-4081-437b-9c45-fecf54654a8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef3ae2c1-4081-437b-9c45-fecf54654a8b
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ef3ae2c1-4081-437b-9c45-fecf54654a8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ef3ae2c1-4081-437b-9c45-fecf54654a8b"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-dbe1aa4e-0413-405d-b41a-0f99c7ddba69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbe1aa4e-0413-405d-b41a-0f99c7ddba69
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dbe1aa4e-0413-405d-b41a-0f99c7ddba69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-dbe1aa4e-0413-405d-b41a-0f99c7ddba69"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-9befb0bc-1ba3-4c39-9ca4-423db05bb6d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9befb0bc-1ba3-4c39-9ca4-423db05bb6d7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9befb0bc-1ba3-4c39-9ca4-423db05bb6d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9befb0bc-1ba3-4c39-9ca4-423db05bb6d7"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-b10dae09-a582-4563-918d-6f809aa55423

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b10dae09-a582-4563-918d-6f809aa55423
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b10dae09-a582-4563-918d-6f809aa55423
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b10dae09-a582-4563-918d-6f809aa55423"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-3db088f1-0fc4-49af-98a6-6fa2527c5d16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3db088f1-0fc4-49af-98a6-6fa2527c5d16
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3db088f1-0fc4-49af-98a6-6fa2527c5d16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3db088f1-0fc4-49af-98a6-6fa2527c5d16"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-f58fbd03-05f1-458c-a5eb-55167a0ce28e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f58fbd03-05f1-458c-a5eb-55167a0ce28e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f58fbd03-05f1-458c-a5eb-55167a0ce28e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f58fbd03-05f1-458c-a5eb-55167a0ce28e"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-35d33449-d234-463b-b755-1edc635f6833

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35d33449-d234-463b-b755-1edc635f6833
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35d33449-d234-463b-b755-1edc635f6833
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-35d33449-d234-463b-b755-1edc635f6833"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-c0294121-3af6-4801-8700-74b5bc3d298d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0294121-3af6-4801-8700-74b5bc3d298d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c0294121-3af6-4801-8700-74b5bc3d298d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c0294121-3af6-4801-8700-74b5bc3d298d"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-138d9d88-426b-4ef9-a836-97040b894ffd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-138d9d88-426b-4ef9-a836-97040b894ffd
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-138d9d88-426b-4ef9-a836-97040b894ffd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-138d9d88-426b-4ef9-a836-97040b894ffd"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-daab23ff-2972-4112-a23f-985b9fbd8d17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daab23ff-2972-4112-a23f-985b9fbd8d17
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-daab23ff-2972-4112-a23f-985b9fbd8d17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-daab23ff-2972-4112-a23f-985b9fbd8d17"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-b7ccc87c-a8ce-4b7e-b94c-e2e081f06019

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7ccc87c-a8ce-4b7e-b94c-e2e081f06019
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b7ccc87c-a8ce-4b7e-b94c-e2e081f06019
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b7ccc87c-a8ce-4b7e-b94c-e2e081f06019"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-606fd266-551f-4996-9cb7-3326a688e2dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-606fd266-551f-4996-9cb7-3326a688e2dc
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-606fd266-551f-4996-9cb7-3326a688e2dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-606fd266-551f-4996-9cb7-3326a688e2dc"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-a2305414-88da-4737-bb3f-45dae2cf4172

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2305414-88da-4737-bb3f-45dae2cf4172
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2305414-88da-4737-bb3f-45dae2cf4172
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

{"id":"acc_ff21eeea-054d-44a5-9f4c-dba1b8ce8794","handle":"qa-dcd4f6abf941","displayName":"QA dcd4f6abf941","region":"eu","role":"user","createdAt":"2026-11-24T12:38:06.300027508Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee54474b-5de1-4fcc-883a-8ea23739a211

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee54474b-5de1-4fcc-883a-8ea23739a211
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Tue, 24 Nov 2026 12:38:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee54474b-5de1-4fcc-883a-8ea23739a211
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

## 83. POST /v1/auth/token

```text
#83 POST http://localhost:7070/v1/auth/token
correlation: qa-853938fb-ebb8-4570-b998-eedb5faa58b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-853938fb-ebb8-4570-b998-eedb5faa58b7
Content-Type: application/json

--- request body ---
{"handle":"qa-dcd4f6abf941","password":"****"}

--- response: 401 in 4 ms ---
Date: Tue, 24 Nov 2026 12:38:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-853938fb-ebb8-4570-b998-eedb5faa58b7
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-853938fb-ebb8-4570-b998-eedb5faa58b7"}
```
